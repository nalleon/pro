package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.PersonaList;
import es.ies.puerto.modelo.interfaces.ICrudMethods;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileXML extends UtilidadesClass implements ICrudMethods {

    @Root(name = "personas")
    List<Persona> personaList;
    String path="src/main/resources/data.xml";

    @Override
    public Persona obtainPersona(Persona persona) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc = builder.parse(new File(path));

            NodeList personas = doc.getElementsByTagName("persona");

            for (int i=0; i < personas.getLength(); i++) {
                Node personaNode = personas.item(i);
                int id = Integer.parseInt(doc.getElementsByTagName("id").item(0).getTextContent());

                if (personaNode.getNodeType() == Node.ELEMENT_NODE && id == persona.getId()) {
                    String name = doc.getElementsByTagName("name").item(0).getTextContent();
                    int age = Integer.parseInt(doc.getElementsByTagName("age").item(0).getTextContent());
                    String email = doc.getElementsByTagName("email").item(0).getTextContent();
                    persona.setName(name);
                    persona.setAge(age);
                    persona.setEmail(email);
                    return persona;
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Persona> obtainPersonas() {
        Serializer serializer = new Persister();
        try {
        File xmlFile = new File(path);
        //Hacer un objeto intermedio
        PersonaList personasListAux = serializer.read(PersonaList.class, xmlFile);
        personaList = personasListAux.getPersonas();
        return personaList;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addPersona(Persona persona) {

    }

    @Override
    public void deletePersona(Persona persona) {

    }

    @Override
    public void update(Persona persona) {

    }

}
