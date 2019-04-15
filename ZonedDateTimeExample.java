import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;


public class ZonedDateTimeExample {

    public static void main(String[] args) throws ParseException {
    	
    	ArrayList a = new ArrayList();
    	a.add("azzz");
    	a.add(3);
    	a.add(2.50);
    	System.out.println("a----->"+a);
    	
    	Object obj = 2;
    	
    	/*ArrayList ar = new ArrayList();
    	ar.add("one");
    	ar.add("two");
    	ar.add("three");
    	ArrayList br = new ArrayList();
    	br = ar;
    	HashMap<String, Object>hashMap = new HashMap<String, Object>();
    	//hashMap.put("list",new ArrayList<String>(ar));
    	hashMap.put("list",br);
    	System.out.println("1 ---------->"+hashMap.get("list"));
    	//ar.add("four");
    	//ar.add("five");
    	br.add("four");
    	br.add("five");
    	System.out.println("2 ---------->"+hashMap.get("list"));
    	
    	String toRecipients = "aaa@bbb.com,bbb@ccc.com";
		String ccRecipients = "";
		String bccRecipients = "";
		String emailRecipients = "to="+toRecipients;
		if(ccRecipients != ""){
			emailRecipients = emailRecipients+"&CC="+ccRecipients;
		}
		if(bccRecipients != ""){
			emailRecipients = emailRecipients+"&BCC="+bccRecipients;
		}
		System.out.println("emailrecipients------------->"+emailRecipients);

    	 ArrayList metaTags = new ArrayList();
         metaTags.add("CANCEL");
         metaTags.add("PDF");
         metaTags.add("TEST");
         metaTags.add("new");
         String s1 = "";
         String s2 = "";
         for(int i=0;i<metaTags.size();i++){
         	s1 = (String) metaTags.get(i); //CANCEL
         	//if(i < metaTags.size()){
         		System.out.println("s2 before----->"+s2);
         		s2 = s2+"{\"tag\": \""+s1+"\"}";
         		if(i < metaTags.size()-1){
         			s2 = s2+",";
         		}
         		System.out.println("s2 after---->"+s2);
         	//}
         }
         String original = "["+s2+"]";
         for(int i=0;i<metaTags.size();i++){
        	 s1 = (String) metaTags.get(i);
        	 s2 = s2 + "/"+ s1;
         }
         System.out.println("s2------------->"+s2);
         
         String test = "[{\"tag\": \"CANCEL\"},{\"tag\": \"PDF\"},{\"tag\": \"TEST\"}]";
         String st = "http://portal.solartis.net:8080/share/page/site/alfresco-api-demo/document-details?nodeRef=workspace://SpacesStore/135ecaff-534f-42db-b647-f230178c0dc7;1.0";
         st = st.substring(0, st.indexOf(";"));
         String docID = "135ecaff-534f-42db-b647-f230178c0dc7;1.0";
         docID = docID.substring(0, docID.indexOf(";"));
         System.out.println(docID);
         System.out.println("st-------->"+st);
         System.out.println("test---->"+test);
         
         String sample = "Document/CHIC/QuotePDFs/957688/Application - Liability_MAR-28-2018-17-43-9.pdf";
         String sample1 = sample.substring(0,sample.lastIndexOf("/"));
         String sample2 = sample.substring(sample.lastIndexOf("/")+1,sample.length());
         System.out.println("sample1------------->"+sample1);
         System.out.println("sample2------------->"+sample2);
         
         String path = "/Sites/alfresco-api-demo/documentLibrary/CHIC/COVER ME INSURANCE AGENCY OF NEW JERSEY/Limousine/CHIC Liability/Commercial Hirecar Insurance Company/QCHIC-958113";
         String name = "QCHIC-958113";
         if (path != null && path.length() > name.length()) {
             String c = path.substring(0, path.length() - name.length());
             System.out.println("c----->"+c);
         }
         
         String a = "ID Card - Vehicle #1.pdf";
         a = a.substring(a.indexOf("V"),a.indexOf("."));
         System.out.println("a-------->"+a);
         
         ArrayList<String> arr = new ArrayList<String>();
         arr.add("test");
         arr.add("hello");
         System.out.println("arr"+arr);
         if(arr.contains("hello"))
        	 arr.remove("hello");
         System.out.println("arr"+arr);
         
         String alfrescoFolderPath = "/Sites/alfresco-api-demo/documentLibrary";
         String outputFilePath = "/CHIC/COVER ME INSURANCE AGENCY OF NEW JERSEY/Limousine/CHIC Liability/Commercial Hirecar Insurance Company/QCHIC-958929";
         outputFilePath = outputFilePath.replaceFirst("/", "");
         System.out.println("outputFilePath----------->"+outputFilePath);
         //outputFilePath = "CHIC/COVER ME INSURANCE AGENCY OF NEW JERSEY/Limousine/CHIC Liability/Commercial Hirecar Insurance Company/QCHIC-958929";
         String[] folderList = outputFilePath.split("/");
         for(String folderName: folderList) {
     		if(!folderName.equals("")) {
     			alfrescoFolderPath = alfrescoFolderPath+"/"+folderName;
     			String modifiedFolderName = folderName;
     			System.out.println("alfrescoFolderPath---------->"+alfrescoFolderPath);
     			if (alfrescoFolderPath != null && alfrescoFolderPath.length() > modifiedFolderName.length()) {
     	             String z = alfrescoFolderPath.substring(0, alfrescoFolderPath.length() - modifiedFolderName.length());
     	             System.out.println("z----->"+z);
     	         }
     		}
	     }
         ArrayList<String> Tags = new ArrayList<String>();
         Tags.add("test");
         Tags.add("sdf");
         Tags.add("dfdf");
         Tags.add("fdrgter");
         Tags.add("hgjgh");
         Tags.add("fgh");
         Tags.add("fru");
         Tags.add("kjh");
         String tagName = "";
         String appendTags = "";
        for(int index=0;index<Tags.size();index++){
        	tagName = (String) Tags.get(index);
        	appendTags = appendTags+"{\"tag\":\""+tagName+"\"}";
        	if(index < Tags.size()-1){
     			appendTags = appendTags+",";
     		}
        }
        System.out.println("appendTags-------->"+appendTags);
        
        String tags = "[CHIC, COVER ME INSURANCE AGENCY OF NEW JERSEY, chicdev_uw, AzarLimo, Azar, QCHIC-960599, 2018-04-10, Limousine, NJ, Application PDF]";
        tags = tags.replace('[',' ');
        tags = tags.replace(']',' ');
        System.out.println("tags---------------->"+tags);
        String[] tagValues = tags.split(",");
        ArrayList<String> tagList  = new ArrayList<String>();
        for(String tag: tagValues) {
        	tag = tag.trim();
        	System.out.print(tag);
        	tagList.add(tag);
        }
        System.out.println();
        System.out.println("tagList------------->"+tagList);
        
        String newFolderPath = "";
        String[] list = null;
		System.out.println("newFolderPath------------------->"+newFolderPath);
		newFolderPath = newFolderPath.replaceFirst("/", "");
		if(!newFolderPath.equals("")){
			list = newFolderPath.split("/");
			System.out.println(list.length);
			if(list.length > 0){
				for(int i=0;i<list.length;i++){
					System.out.println("azzzzzzz");
				}
			}
		}
		
		String documentType = "POLICY\""+","+"\"IDCARD\""+","+"\"AI_COI\""+","+"\"INVOICE";
		System.out.println(documentType);
		
		String fileName = "Application - Liability_MAY-24-2018-16-28-43.pdf";
		String fileType = fileName.substring(fileName.indexOf(".")+1,fileName.length());
		System.out.println("filetype----------------->"+fileType);*/
    }

}