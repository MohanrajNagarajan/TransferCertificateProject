package com.student.transfercertificate.util;

import java.io.File; 
import java.io.IOException;
  
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage; 
import org.apache.pdfbox.pdmodel.PDPageContentStream; 
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import com.student.transfercertificate.model.TransferCertificate;
  
public class PDFGenerateUtil {
  
		
	public String geneatePDF(TransferCertificate transferCertificate) {
		
      //Loading an existing document
		try {
			System.out.println("Reached");
			ClassLoader classLoader = getClass().getClassLoader();
			//Loading an existing document
		      File file = new File(classLoader.getResource("tc.pdf").getFile());
		      System.out.println("Loaded");
		      PDDocument document = PDDocument.load(file);
		       
		      //Retrieving the pages of the document 
		      PDPage page = document.getPage(0);
		      PDPageContentStream contentStream = new PDPageContentStream(document, page,true,false);
		      
		      
		    //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(100, 100);

		      String text = transferCertificate.getSerialNo()+"";

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("first Content added");
		      
		      
		      //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 480);

		       text = transferCertificate.getStudentName();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("first Content added");
		      
		      contentStream.beginText(); 
		      
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
		      
		      contentStream.newLineAtOffset(400, 460);

		      text = transferCertificate.getRegisterNumber()+"";

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("second Content added");
		      
		    //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 438);

		       text = transferCertificate.getSex();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("Third Content added");
		      
		    //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 415);

		       text = transferCertificate.getFatherName();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("fourth Content added");
		      
		    //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 395);

		       text = transferCertificate.getNationality()+" / "+transferCertificate.getReligion();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("fifth Content added");
		      
		      //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 375);

		       text = transferCertificate.getCommunity()+" / "+transferCertificate.getSubCaste();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("sixth Content added");
		      
		    //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 358);

		       text = transferCertificate.getDob();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("seventh Content added");

		      //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 333);

		       text = transferCertificate.getDateOfAdmission();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("eighth Content added");
		      
		      //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 292);

		       text = transferCertificate.getCourse()+" / "+transferCertificate.getYear()+" & "+transferCertificate.getSemester();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("ninth Content added");
		      
		      //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 245);

		       text = transferCertificate.getCourse()+" / "+transferCertificate.getYear()+" & "+transferCertificate.getSemester();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("tenth Content added");
		      
		    //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 210);

		       text = transferCertificate.getIsQualifiedPromotion();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("eleventh Content added");
		      
		      //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 185);

		       text = transferCertificate.getConduct();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("twelth Content added");
		      
		      //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 165);

		       text = transferCertificate.getRemarks();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("thirteenth Content added");
		      
		      //Begin the Content stream 
		      contentStream.beginText(); 
		       
		      //Setting the font to the Content stream  
		      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		      //Setting the position for the line 
		      contentStream.newLineAtOffset(400, 145);

		       text = transferCertificate.getDateOfIssuingTC();

		      //Adding text in the form of string 
		      contentStream.showText(text);   
		           

		      //Ending the content stream
		      contentStream.endText();

		      System.out.println("fourteenth Content added");

		      //Closing the content stream
		      contentStream.close();
		      String newPDFPath="src/main/resources/"+transferCertificate.getSerialNo()+".pdf";
		      
		      System.out.println(newPDFPath);
		      File file1 = new File(newPDFPath);
		      if(file1.createNewFile()){
		            System.out.println(newPDFPath+" File Created");
		        }else System.out.println("File "+newPDFPath+" already exists");
		        
		      System.out.println(file1);
		      //Saving the document
		      document.save(new File(newPDFPath));

		      //Closing the document
		      document.close();
		return file1.getAbsolutePath();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			return "FAILED";
	}

   }
}