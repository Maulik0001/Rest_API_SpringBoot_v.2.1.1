/*
 * @author: Maulik Patel
 */

package com.rest.api.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.rest.api.dto.DiscountEntity;
import com.rest.api.service.DiscountService;

@RestController
public class HomeController {

	@Autowired
	DiscountService discountService;

	 @RequestMapping(value = "/discount/{userType}/{amount}",method = RequestMethod.GET, produces = "application/json")
	    public String delete(@PathVariable String userType , @PathVariable String amount) {
		 
		 HashMap<String, String> resultmap = new HashMap<String, String>();
			
			try {
				/*String userType = request.getParameter("userType");
				String amount = request.getParameter("amount");*/
				
				Double finalAmount = Double.parseDouble(amount);
				List<DiscountEntity> discountList = (List<DiscountEntity>) discountService.findByuserType(userType);
				Double famount, discountPrice = 0.0, finalDiscountPrice;
				
				if (discountList != null && discountList.size() > 0) {
					int i=0;
					for (DiscountEntity de : discountList) {
						if(i==0) {
							if (finalAmount > de.getStart()) {
								if (finalAmount > de.getEnd()) {
									famount = de.getEnd() - de.getStart();
									double disPrice = (famount * de.getDiscountPerc()) / 100;
									discountPrice = discountPrice + disPrice;
								} else {
									famount = finalAmount - de.getStart();
									double disPrice = (famount * de.getDiscountPerc()) / 100;
									discountPrice = discountPrice + disPrice;
								}
								finalDiscountPrice = finalAmount - discountPrice;
								resultmap.put("discounted amount", finalDiscountPrice.toString());
							} else {
								resultmap.put("discounted amount", amount);
							}
						} else {
							if (finalAmount > de.getStart()) {
								if (finalAmount > de.getEnd()) {
									famount = de.getEnd() - de.getStart();
									double disPrice = (famount * de.getDiscountPerc()) / 100;
									discountPrice = discountPrice + disPrice;
								} else {
									famount = finalAmount - de.getStart();
									double disPrice = (famount * de.getDiscountPerc()) / 100;
									discountPrice = discountPrice + disPrice;
								}
								finalDiscountPrice = finalAmount - discountPrice;
								resultmap.put("discounted amount", finalDiscountPrice.toString());
							} 
						}
						i++;
					}
				} else {
				//	System.out.println("discountList wrong::");
					resultmap.put("discounted amount", amount);
				}
				Gson gson = new Gson();
				return gson.toJson(resultmap);
			} catch (Exception e) {
				e.printStackTrace();
				resultmap.put("status", "error in json");
				Gson gson = new Gson();
				return gson.toJson(resultmap);
			}
	 }
	
	/*@CrossOrigin
	@RequestMapping(value = "/discount", method = RequestMethod.GET, produces = "application/json")
	public String getDiscount(HttpServletRequest request, HttpServletResponse response) {
		
		HashMap<String, String> resultmap = new HashMap<String, String>();
		
		try {
			String userType = request.getParameter("userType");
			String amount = request.getParameter("amount");
			
			Double finalAmount = Double.parseDouble(amount);
			List<DiscountEntity> discountList = (List<DiscountEntity>) discountService.findByuserType(userType);
			Double famount, discountPrice = 0.0, finalDiscountPrice;
			
			if (discountList != null && discountList.size() > 0) {
				int i=0;
				for (DiscountEntity de : discountList) {
					if(i==0) {
						if (finalAmount > de.getStart()) {
							if (finalAmount > de.getEnd()) {
								famount = de.getEnd() - de.getStart();
								double disPrice = (famount * de.getDiscountPerc()) / 100;
								discountPrice = discountPrice + disPrice;
							} else {
								famount = finalAmount - de.getStart();
								double disPrice = (famount * de.getDiscountPerc()) / 100;
								discountPrice = discountPrice + disPrice;
							}
							finalDiscountPrice = finalAmount - discountPrice;
							resultmap.put("discounted amount", finalDiscountPrice.toString());
						} else {
							resultmap.put("discounted amount", amount);
						}
					} else {
						if (finalAmount > de.getStart()) {
							if (finalAmount > de.getEnd()) {
								famount = de.getEnd() - de.getStart();
								double disPrice = (famount * de.getDiscountPerc()) / 100;
								discountPrice = discountPrice + disPrice;
							} else {
								famount = finalAmount - de.getStart();
								double disPrice = (famount * de.getDiscountPerc()) / 100;
								discountPrice = discountPrice + disPrice;
							}
							finalDiscountPrice = finalAmount - discountPrice;
							resultmap.put("discounted amount", finalDiscountPrice.toString());
						} 
					}
					i++;
				}
			} else {
			//	System.out.println("discountList wrong::");
				resultmap.put("discounted amount", amount);
			}
			Gson gson = new Gson();
			return gson.toJson(resultmap);
		} catch (Exception e) {
			e.printStackTrace();
			resultmap.put("status", "error in json");
			Gson gson = new Gson();
			return gson.toJson(resultmap);
		}
	}*/

}