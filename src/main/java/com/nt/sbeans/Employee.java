package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("classpath:com/nt/commons/info.properties")
public class Employee {
	@Value("${emp.name}")
	private String ename;
	@Value("${emp.id}")
	private int eno;
	@Value("${emp.address}")
	private String eaddress;

	@Value("${os.name}")
	private String os;

	@Value("${os.version}")
	private String osVersion;

	@Value("${user.name}")
	private String username;

	@Value("${Path}")
	private String pathContent;

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eno=" + eno + ", eaddress=" + eaddress + ", os=" + os + ", osVersion="
				+ osVersion + ", username=" + username + ", pathContent=" + pathContent + "]";
	}


}
