import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;

public class FileHandling {

	public static void main(String[] args) {
		File file = new File("http://portal.solartis.net:8080/share/proxy/alfresco/api/node/content/workspace/SpacesStore/99c9f0ab-c78a-4980-9665-2fbecf69621a/Endorsement_FEB-27-2018-12-32-28.pdf");
		System.out.println("file object--------->"+file);
		BufferedInputStream input = null;
		BufferedOutputStream output = null;
		final int DEFAULT_BUFFER_SIZE = 10240;
		try{
			//input = new BufferedInputStream(input);
			URI uri = new URI("http://portal.solartis.net:8080/alfresco/guestDownload/d/workspace/SpacesStore/531c6c66-59c7-48b0-b06a-4a9e1a38b0cf/QuoteProposal-Liability_MAR-9-2018-11-22-46.pdf");
			File f1 = new File(uri);
			FileInputStream fis = new FileInputStream(f1);
			System.out.println("fis----------->"+fis);
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("exception---------->"+ex);
		}

	}

}
