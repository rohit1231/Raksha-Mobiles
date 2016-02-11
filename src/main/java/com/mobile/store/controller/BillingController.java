package com.mobile.store.controller;

import com.mobile.store.model.BillingForm;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bill")
public class BillingController {

	@RequestMapping(method = RequestMethod.GET, value = "/generate-bill")
	public String newBill(ModelMap model) {
		BillingForm billingForm = new BillingForm();
		model.addAttribute("billingForm", billingForm);
		// XXX
		return "billing form jsp XXX";

	}

	// public

	@RequestMapping(method = RequestMethod.POST, value = "/generate-bill")
	public String saveBill(@Valid BillingForm form, BindingResult result,
			ModelMap model) {
		if (result.hasErrors()) {
			return "billing form jsp XXX";
		}
		model.addAttribute("success, Bill generated successfully for  ",
				form.getFirstName());
		return "success";
	}

}
