package com.custom.theme.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.util.WebKeys;

public class CustomThemePreAction extends Action{

	@Override
	public void run(final HttpServletRequest request, final HttpServletResponse response)
	    throws ActionException {

	    @SuppressWarnings("unchecked")
		Map<String, Object> vmVariables = (Map<String, Object>) request.getAttribute(WebKeys.VM_VARIABLES);
	    if (vmVariables == null) {
	      vmVariables = new HashMap<String, Object>(1);
	    }
	    vmVariables.put("color", "green");
	    request.setAttribute(WebKeys.VM_VARIABLES, vmVariables);
	}
}