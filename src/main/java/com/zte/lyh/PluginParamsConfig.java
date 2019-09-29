package com.zte.lyh;

import java.io.Serializable;

public class PluginParamsConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1246187772426993272L;

	// 生成的bean路径
	private String beanPath;

	// 编译路径
	private String targetPath;

	// 生成接口路径包
	private String restPath;

	// 生成的service路径
	private String servicePath;

	// 反射获取bean的calss文件路径
	private String classPath;

	private String name;

	private String jar;

	private String className;
	
	private String url;
	
	private String password;
	
	private String user;
	
	private String driver;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJar() {
		return jar;
	}

	public void setJar(String jar) {
		this.jar = jar;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getBeanPath() {
		return beanPath;
	}

	public void setBeanPath(String beanPath) {
		this.beanPath = beanPath;
	}

	public String getTargetPath() {
		return targetPath;
	}

	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}

	public String getRestPath() {
		return restPath;
	}

	public void setRestPath(String restPath) {
		this.restPath = restPath;
	}

	public String getServicePath() {
		return servicePath;
	}

	public void setServicePath(String servicePath) {
		this.servicePath = servicePath;
	}

	public String getClassPath() {
		return classPath;
	}

	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}
	
	

}
