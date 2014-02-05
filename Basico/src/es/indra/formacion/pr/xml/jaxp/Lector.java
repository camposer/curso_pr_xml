package es.indra.formacion.pr.xml.jaxp;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class Lector {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance(); 
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		
		Document doc = builder.parse(new File("xml/personas.xml"));
		System.out.println(doc);
	}

}
