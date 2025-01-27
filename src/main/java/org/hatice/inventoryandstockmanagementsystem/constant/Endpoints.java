package org.hatice.inventoryandstockmanagementsystem.constant;

public class Endpoints {
	
	public static final String VERSION = "/v1";
	
	public static final String API = "/api";
	public static final String DEVELOPER = "/dev";
	public static final String TEST = "/test";
	public static final String PROD = "/prod";
	
	public static final String ROOT = VERSION + DEVELOPER;
	
	public static final String USER = ROOT + "/user";
	public static final String SUPPLIER = ROOT + "/supplier";
	public static final String CATEGORY = ROOT + "/category";
	public static final String ORDER = ROOT + "/order";
	public static final String PRODUCT = ROOT + "/product";
	public static final String PRODUCTORDER = ROOT + "/product-order";
	public static final String STOCKMOVEMENT = ROOT + "/stock-movement";
	public static final String WAREHOUSE = ROOT + "/warehouse";
	public static final String ROLE = ROOT + "/role";
	
	
	public static final String SAVE = "/save";
	public static final String FINDALL = "/findall";
	public static final String FINDBYID = "/findbyid";
	public static final String REGISTER = "/register";
	public static final String DOLOGIN = "/dologin";
	
	
}