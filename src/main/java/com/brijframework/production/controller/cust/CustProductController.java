package com.brijframework.production.controller.cust;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.brijframework.production.contants.Constants.*;
import com.brijframework.production.dto.cust.UICustProduct;
import com.brijframework.production.service.cust.CustProductService;

@RestController
@RequestMapping("/api/cust/product")
public class CustProductController {

	@Autowired
	private CustProductService custProductService;
	
	@PostMapping
	public UICustProduct addProduct(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustProduct product) {
		return custProductService.saveProduct(custAppId,product);
	}
	
	@PutMapping
	public UICustProduct updateProduct(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustProduct product) {
		return custProductService.updateProduct(custAppId,product);
	}
	
	@GetMapping
	public List<UICustProduct> getProductList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custProductService.getProductList(custAppId);
	}
	
	@GetMapping("/type/{typeId}")
	public UICustProduct getProductList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable(TYPE_ID) String typeId) {
		return custProductService.getProduct(custAppId, typeId);
	}
}
