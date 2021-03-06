package com.dkaedv.glghproxy.controller;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.egit.github.core.Repository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v3/user")
public class UserController {
	private final static Log LOG = LogFactory.getLog(UserController.class);
	
	@RequestMapping("/repos")
	@ResponseBody
	public List<Repository> getReposForCurrentUser(
			@RequestParam String per_page,
			@RequestParam String page,
			@RequestHeader("Authorization") String authorization) throws IOException {

		LOG.info("Received request: per_page=" + per_page + ", page=" + page);

		return new Vector<Repository>();
	}

}
