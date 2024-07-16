package lk.ijse.gdse68.aad.sd.assignment;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create an object to serialize
        Person person = new Person("Sachini", 22,"sachini@gmail.com","Matara");

        // Serialize the object
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(person);
        byte[] serializedData = bos.toByteArray();

        // Deserialize the object
        ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Person deserializedPerson = (Person) ois.readObject();

        System.out.println("Deserialized Person: " + "Name:" + deserializedPerson.getName()  + ", " +"Age:" + deserializedPerson.getAge() +", " +"Email:" + deserializedPerson.getMail() + ", " +"City:" + deserializedPerson.getCity());
    }
}

class Person implements Serializable {
    private String name;
    private int age;
    private String mail;
    private String city;

    public Person(String name, int age, String mail, String city) {
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMail(){
        return mail;
    }

    public String getCity(){
        return city;
    }
}