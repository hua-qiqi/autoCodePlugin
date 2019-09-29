package com.zte.lyh;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLParser {

	public List<PluginParamsConfig> getPluginList() throws DocumentException {
		List<PluginParamsConfig> list = new ArrayList<PluginParamsConfig>();
		String path = this.getClass().getResource("/").getPath();
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(path + "plugin.xml"));
		Element root = document.getRootElement();
		List<Element> plugins = root.elements("plugin");
		for (Element pluginObj : plugins) {
			Element pluginEle = pluginObj;
			PluginParamsConfig plugin = new PluginParamsConfig();
			plugin.setName(pluginEle.elementText("name"));
			plugin.setJar(pluginEle.elementText("jar"));
			plugin.setClassName(pluginEle.elementText("class"));
			Element prop = pluginEle.element("properties");
			List<Element> properties=prop.elements("property");
			properties.stream().forEach(p -> {
				String name = p.attributeValue("name");
				String value = p.getText();
				System.out.println("name："+name+"---value"+value);
				if ("beanPath".equals(name)) {
					plugin.setBeanPath(value);
				}
				if ("classPath".equals(name)) {
					plugin.setClassPath(value);
				}
				if ("targetPath".equals(name)) {
					plugin.setTargetPath(value);
				}
				if ("connectionURL".equals(name)) {
					plugin.setUrl(value);

				}
				if ("servicePath".equals(name)) {
					plugin.setServicePath(value);
				}
				if ("restPath".equals(name)) {
					plugin.setRestPath(value);
				}
				if ("password".equals(name)) {
					plugin.setPassword(value);
				}
				if ("driverClass".equals(name)) {
					plugin.setDriver(value);
				}

				if ("userId".equals(name)) {
					plugin.setUser(value);
				}

			});
			list.add(plugin);
		}
		return list;
	}

	public static void main(String[] args) throws DocumentException {
		XMLParser p = new XMLParser();
		p.getPluginList();
	}

}
