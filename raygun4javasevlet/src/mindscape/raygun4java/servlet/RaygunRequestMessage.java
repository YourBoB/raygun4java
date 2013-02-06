package mindscape.raygun4java.servlet;

import java.util.Map;

public class RaygunRequestMessage {

	private String hostName;
	private String url;
	private String httpMethod;
	private String ipAddress;
	private Map queryString;
	private Map data;
	private Map form;
	private Map headers;
	private String rawData;	
	
	public RaygunRequestMessage()
	{			
	}
	
}