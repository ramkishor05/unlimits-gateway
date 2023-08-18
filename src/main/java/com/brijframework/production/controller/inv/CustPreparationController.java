package com.brijframework.production.controller.inv;

import static com.brijframework.production.contants.Constants.CUST_APP_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.production.dto.cust.UICustPreparation;
import com.brijframework.production.service.cust.inv.CustPreparationService;

@RestController
@RequestMapping("/api/cust/preparation")
public class CustPreparationController {

	@Autowired
	CustPreparationService custPreparationService;
	
	@PostMapping
	public UICustPreparation addPreparation(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustPreparation uiCustPreparation) {
		return custPreparationService.savePreparation(custAppId,uiCustPreparation);
	}
	
	@GetMapping
	public List<UICustPreparation> getPreparationList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custPreparationService.getPreparationList(custAppId);
	}
	
	@GetMapping("/{typeId}")
	public UICustPreparation getPreparationList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable("typeId") String typeId) {
		return custPreparationService.getPreparation(custAppId, typeId);
	}
}
