package es.indra.formacion.pr.xml.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import es.indra.formacion.pr.xml.jaxb.model.Coches;

public class PersonaMarshaller {
	public static void main(String[] args) {

		try {

			File file = new File("xml/coches.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Coches.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Coches coches = (Coches) jaxbUnmarshaller.unmarshal(file);
			System.out.println(coches);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
