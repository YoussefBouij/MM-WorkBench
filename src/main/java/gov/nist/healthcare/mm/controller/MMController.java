package gov.nist.healthcare.mm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gov.nist.healthcare.hl7.mm.v2.script.execution.MessageModifierService;
import gov.nist.healthcare.mm.domain.ModifyRequest;
import gov.nist.healthcare.mm.domain.ModifyResult;
import gov.nist.healthcare.mm.domain.Stub;

@RestController
public class MMController {
 
	@Autowired
	private MessageModifierService mmService;
	
    @RequestMapping(value="/modify", method=RequestMethod.POST)
    @ResponseBody
    public ModifyResult hello(@RequestBody ModifyRequest req) {
    	
    	
        //TODO Logic
    		return new Stub(req.getMsg());
    }
 
}