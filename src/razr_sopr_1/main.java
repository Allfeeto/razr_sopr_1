package razr_sopr_1;

import java.sql.Date;

public class main {
	
	public static class Person {
	    private int ID; // суррогатный ключ
	    private String Shifer; // шифр клиента
	    private String Inn; // ИНН клиента
	    private String Type; // тип клиента (физическое, юридическое лицо)
	    private Date Data; // дата регистрации клиента

	    // Конструктор без параметров
	    public Person() {}

	    // Конструктор с параметрами
	    public Person(int ID, String Shifer, String Inn, String Type, Date Data) {
	        this.ID = ID;
	        this.Shifer = Shifer;
	        this.Inn = Inn;
	        this.Type = Type;
	        this.Data = Data;
	    }

	    // Геттеры и сеттеры
	    public int getID() {
	        return ID;
	    }

	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public String getShifer() {
	        return Shifer;
	    }

	    public void setShifer(String Shifer) {
	        this.Shifer = Shifer;
	    }

	    public String getInn() {
	        return Inn;
	    }

	    public void setInn(String Inn) {
	        this.Inn = Inn;
	    }

	    public String getType() {
	        return Type;
	    }

	    public void setType(String Type) {
	        this.Type = Type;
	    }

	    public Date getData() {
	        return Data;
	    }

	    public void setData(Date Data) {
	        this.Data = Data;
	    }
	}

	public static class Citizen {
	    private int ID; // суррогатный ключ
	    private int DocumentID; // внешний ключ для связи с моделью Document
	    private int PersonID; // внешний ключ для связи с моделью Person
	    private String FirstName; // имя клиента
	    private String SecondName; // фамилия клиента
	    private String LastName; // отчество клиента
	    private String Number; // номер документа, удостоверяющего личность

	    // Конструктор без параметров
	    public Citizen() {}

	    // Конструктор с параметрами
	    public Citizen(int ID, int DocumentID, int PersonID, String FirstName, String SecondName, String LastName, String Number) {
	        this.ID = ID;
	        this.DocumentID = DocumentID;
	        this.PersonID = PersonID;
	        this.FirstName = FirstName;
	        this.SecondName = SecondName;
	        this.LastName = LastName;
	        this.Number = Number;
	    }

	    // Геттеры и сеттеры
	    public int getID() {
	        return ID;
	    }

	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public int getDocumentID() {
	        return DocumentID;
	    }

	    public void setDocumentID(int DocumentID) {
	        this.DocumentID = DocumentID;
	    }

	    public int getPersonID() {
	        return PersonID;
	    }

	    public void setPersonID(int PersonID) {
	        this.PersonID = PersonID;
	    }

	    public String getFirstName() {
	        return FirstName;
	    }

	    public void setFirstName(String FirstName) {
	        this.FirstName = FirstName;
	    }

	    public String getSecondName() {
	        return SecondName;
	    }

	    public void setSecondName(String SecondName) {
	        this.SecondName = SecondName;
	    }

	    public String getLastName() {
	        return LastName;
	    }

	    public void setLastName(String LastName) {
	        this.LastName = LastName;
	    }

	    public String getNumber() {
	        return Number;
	    }

	    public void setNumber(String Number) {
	        this.Number = Number;
	    }
	}

	public static class Document {
	    private int ID; // суррогатный ключ
	    private String Name; // наименование документа
	    private String Seriy; // серия документа
	    private String Organ; // орган, выдавший документ
	    private Date Data; // дата выдачи документа

	    // Конструктор без параметров
	    public Document() {}

	    // Конструктор с параметрами
	    public Document(int ID, String Name, String Seriy, String Organ, Date Data) {
	        this.ID = ID;
	        this.Name = Name;
	        this.Seriy = Seriy;
	        this.Organ = Organ;
	        this.Data = Data;
	    }

	    // Геттеры и сеттеры
	    public int getID() {
	        return ID;
	    }

	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public String getName() {
	        return Name;
	    }

	    public void setName(String Name) {
	        this.Name = Name;
	    }

	    public String getSeriy() {
	        return Seriy;
	    }

	    public void setSeriy(String Seriy) {
	        this.Seriy = Seriy;
	    }

	    public String getOrgan() {
	        return Organ;
	    }

	    public void setOrgan(String Organ) {
	        this.Organ = Organ;
	    }

	    public Date getData() {
	        return Data;
	    }

	    public void setData(Date Data) {
	        this.Data = Data;
	    }
	}


	public static void main(String[] args) {

        Person person = new Person() {
            {
                setID(1);
                setShifer("A123");
                setInn("1234567890");
                setType("Физическое лицо");
                setData(new Date(2023, 9, 4));
                
            }
        };

        Citizen citizen = new Citizen() {
            {
                setID(1);
                setDocumentID(1);
                setPersonID(person.getID());
                setFirstName("Иван");
                setSecondName("Иванов");
                setLastName("Иванович");
                setNumber("123456789");
            }
        };

        Document document = new Document() {
            {
                setID(1);
                setName("Паспорт");
                setSeriy("1234");
                setOrgan("ОВД");
                setData(new Date(2023, 9, 4));
            }
        };


        System.out.println("Клиент: " + citizen.getFirstName() + " " + citizen.getSecondName() + " " + citizen.getLastName());
        System.out.println("ИНН: " + person.getInn() + ", Тип: " + person.getType());
        System.out.println("Документ: " + document.getName() + " серия " + document.getSeriy());
    }
}
