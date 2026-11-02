package com.teoriejava.site_teorie;

import com.teoriejava.site_teorie.model.Lectie;
import com.teoriejava.site_teorie.repository.LectieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final LectieRepository lectieRepository;

    public DataInitializer(LectieRepository lectieRepository) {
        this.lectieRepository = lectieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        lectieRepository.deleteAll();

        if (lectieRepository.findByTitlu("Metode de Instanță").isEmpty()) {
            lectieRepository.save(new Lectie("Metode de Instanță", "Metode", "Aparțin fiecărui obiect și pot accesa atributele și alte metode ale instanței.", """
                    public class Persoana {
                        private String nume;
                    
                        // Metodă de instanță
                        public void afiseazaNume() {
                            System.out.println("Numele este: " + this.nume);
                        }
                    }
                    Apelare: 
                    Persoana p1=new Persoana("Alex");
                    p1.afiseazaNume();
                    """,


                    """
                            Metodele de instanță sunt cele mai comune metode în Java. 
                            Ele sunt legate direct de un obiect creat (o instanță) și au acces 
                            la atributele acelui obiect prin cuvântul cheie 'this'.
                            """));
        }

        if (lectieRepository.findByTitlu("Metode Statice").isEmpty()) {

            lectieRepository.save(new Lectie("Metode Statice", "Metode", "Aparțin clasei, nu instanțelor; nu pot accesa atributele non-statice sau metodele de instanță.", """
                    public class Calculator {
                        // Metodă statică
                        public static int aduna(int a, int b) {
                            return a + b;
                        }
                    }
                    Apelare: 
                    int suma = Calculator.aduna(5, 10);
                    """,
                    """
                            Metodele statice sunt asociate cu clasa în sine, nu cu un obiect specific. 
                            Ele pot fi apelate fără a crea o instanță a clasei și nu pot accesa 
                            direct atributele non-statice sau metodele de instanță.
                            """));
        }
        if (lectieRepository.findByTitlu("Metode Finale").isEmpty()) {

            lectieRepository.save(new Lectie("Metode Finale", "Metode", "Nu pot fi suprascrise în subclase.", """
                    public class Persoana {
                        private String nume;
                    
                        // Metodă finală
                        public final void afiseazaNume() {
                            System.out.println("Numele este: " + this.nume);
                        }
                    }
                    """,
                    """
                            Metodele finale sunt metode care nu pot fi suprascrise în subclase. 
                            Ele sunt declarate cu cuvântul cheie 'final'.
                            """));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea if-else").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea if-else",
                    "Structuri condiționale",
                    "Luarea deciziilor simple și ramificate în cod folosind if, else și else if.",
                    """
                            int varsta = 20;
                            
                            if (varsta >= 18) {
                                System.out.println("Persoana este majoră.");
                            } else {
                                System.out.println("Persoana este minoră.");
                            }
                            """,
                    """
                            Instrucțiunea 'if' evaluează o condiție booleană. Dacă rezultatul este true, 
                            se execută blocul asociat; dacă este false, programul trece la ramura 'else'.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea switch").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea switch",
                    "Structuri condiționale",
                    "O alternativă la if-else pentru multiple condiții discrete.",
                    """
                            int zi = 3;
                            
                            switch (zi) {
                                case 1:
                                    System.out.println("Luni");
                                    break;
                                case 2:
                                    System.out.println("Marți");
                                    break;
                                case 3:
                                    System.out.println("Miercuri");
                                    break;
                                default:
                                    System.out.println("Altă zi");
                            }
                            """,
                    """
                            Instrucțiunea 'switch' evaluează o expresie și compară rezultatul cu mai multe cazuri. 
                            Când găsește o potrivire, execută blocul asociat acelui caz.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea for").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea for",
                    "Structuri repetitive",
                    "O buclă care iterează un număr specificat de ori.",
                    """
                            for (int i = 0; i < 5; i++) {
                                System.out.println("Număr: " + i);
                            }
                            """,
                    """
                            Bucla 'for' este folosită pentru a repeta un bloc de cod de un număr specificat de ori. 
                            Ea are trei părți: inițializare, condiție și incrementare.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea while").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea while",
                    "Structuri repetitive",
                    "O buclă care continuă să execute un bloc de cod atâta timp cât o condiție este adevărată.",
                    """
                            int i = 0;
                            while (i < 5) {
                                System.out.println("Număr: " + i);
                                i++;
                            }
                            """,
                    """
                            Bucla 'while' evaluează o condiție înainte de fiecare iterație. 
                            Dacă condiția este adevărată, se execută blocul de cod; 
                            dacă este falsă, bucla se oprește.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea do-while").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea do-while",
                    "Structuri repetitive",
                    "O buclă care execută un bloc de cod cel puțin o dată și continuă să execute atâta timp cât o condiție este adevărată.",
                    """
                            int i = 0;
                            do {
                                System.out.println("Număr: " + i);
                                i++;
                            } while (i < 5);
                            """,
                    """
                            Bucla 'do-while' garantează că blocul de cod se va executa cel puțin o dată, 
                            deoarece condiția este evaluată după execuția blocului.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea break").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea break",
                    "Concepte Fundamentale",
                    "O instrucțiune care oprește execuția unei bucle sau a unui switch.",
                    """
                            for (int i = 0; i < 10; i++) {
                                if (i == 5) {
                                    break; // Oprește bucla când i este 5
                                }
                                System.out.println("Număr: " + i);
                            }
                            """,
                    """
                            Instrucțiunea 'break' este folosită pentru a ieși imediat dintr-o buclă sau un switch, 
                            indiferent de condițiile rămase.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea continue").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea continue",
                    "Concepte Fundamentale",
                    "O instrucțiune care sare peste restul codului dintr-o iterație a buclei și trece la următoarea iterație.",
                    """
                            for (int i = 0; i < 10; i++) {
                                if (i % 2 == 0) {
                                    continue; // Sare peste numerele pare
                                }
                                System.out.println("Număr impar: " + i);
                            }
                            """,
                    """
                            Instrucțiunea 'continue' este folosită pentru a sări peste restul codului dintr-o iterație a buclei 
                            și a trece direct la următoarea iterație.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Metode abstracte").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Metode abstracte",
                    "Metode",
                    "O metodă declarată fără implementare, care trebuie să fie implementată în subclase.",
                    """
                            public abstract class Animal {
                                public abstract void sunet();
                            }
                            
                            public class Caine extends Animal {
                                @Override
                                public void sunet() {
                                    System.out.println("Ham Ham");
                                }
                            }
                            """,
                    """
                            Metodele abstracte sunt folosite în clasele abstracte pentru a defini un comportament 
                            care trebuie implementat de toate subclasele. Ele nu au corp și sunt declarate cu cuvântul cheie 'abstract'.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Structuri Lexicale în Java").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Structuri Lexicale în Java",
                    "Concepte Fundamentale",
                    "Elementele fundamentale ale limbajului Java: identificatori, cuvinte cheie, literali, operatori și separatorii.",
                    """
                            public class ExempluLexical {
                                public static void main(String[] args) {
                                    // Literali și identificatori
                                    int varsta = 20; // 'varsta' este identificator, '20' este literal întreg
                                    double pi = 3.14; // literal cu virgulă mobilă
                                    boolean activ = true; // literal boolean
                            
                                    // Operatori aritmetici și de atribuire
                                    int suma = varsta + 5;
                                    suma++; // incrementare
                            
                                    // Afișare utilizând operatorul de concatenare (+)
                                    System.out.println("Valoarea sumei este: " + suma);
                                }
                            }
                            """,
                    """
                            Structurile lexicale reprezintă blocurile de bază din care se construiesc programele Java:
                            1. Identificatori: Nume date claselor, metodelor și variabilelor (case-sensitive, ex: camelCase).
                            2. Cuvinte cheie (Keywords): Termeni rezervați cu semnificație specială (ex: class, public, if, for).
                            3. Literali: Valori constante care apar direct în cod (întregi, float, char, String, boolean, null).
                            4. Operatorii și Separatorii: Simboluri pentru calcul, atribuire și delimitarea structurilor de cod.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Tipuri Primitive și Array-uri").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Tipuri Primitive și Array-uri",
                    "Concepte Fundamentale",
                    "Cele 8 tipuri primitive de date în Java, conversiile (casting) și utilizarea array-urilor unidi- și multidimensionale.",
                    """
                            public class ExempluTipuriSiArrayuri {
                                public static void main(String[] args) {
                                    // Tipuri primitive
                                    int varsta = 20;
                                    double medie = 9.5;
                                    char grupa = 'A';
                                    boolean absolvent = false;

                                    // Array de numere
                                    int[] note = {8, 9, 10, 7, 9};
                                    
                                    // Parcurgere cu for-each
                                    int suma = 0;
                                    for (int nota : note) {
                                        suma += nota;
                                    }
                                    double mediaNote = (double) suma / note.length;
                                    
                                    System.out.println("Media notelor: " + mediaNote);
                                }
                            }
                            """,
                    """
                            1. Tipurile Primitive: Java are 8 tipuri primitive (byte, short, int, long, float, double, char, boolean). Ele stochează direct valorile în stivă și nu sunt obiecte.
                            2. Conversii (Casting): Pot fi implicite (widening, ex: byte la int) sau explicite (narrowing, ex: int la byte prin (byte)i).
                            3. Array-uri: Sunt obiecte de lungime fixă care stochează elemente de același tip. Indexarea începe de la 0, iar clasa 'java.util.Arrays' oferă metode utile precum sort, binarySearch sau toString.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Introducere în clasa String").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Introducere în clasa String",
                    "Concepte Fundamentale",
                    "Manipularea textului în Java, imutabilitatea, String Pool, metode importante și diferența dintre String și StringBuilder.",
                    """
                            public class ExempluString {
                                public static void main(String[] args) {
                                    // Creare și imutabilitate
                                    String text = "Hello";
                                    text = text.concat(" World"); // Atribuirea este necesară!
                                    System.out.println(text); // Hello World

                                    // Compararea conținutului (corect vs greșit)
                                    String s1 = "abc";
                                    String s3 = new String("abc");
                                    System.out.println(s1.equals(s3)); // true (conținut identic)

                                    // Utilizare StringBuilder pentru performanță la concatenări multiple
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Salut, ");
                                    sb.append("Java!");
                                    String rezultat = sb.toString();
                                    System.out.println(rezultat);
                                }
                            }
                            """,
                    """
                            1. Imutabilitate: Odată creat, conținutul unui obiect String nu poate fi modificat. Orice operație (cum ar fi concat) creează un obiect nou.
                            2. String Pool: Java folosește un bazin intern pentru optimizarea memoriei literaliilor identici.
                            3. Metode esențiale: length(), charAt(), substring(), equals(), toLowerCase(), split().
                            4. StringBuilder vs String: StringBuilder este mutabil și mult mai eficient pentru concatenări repetate într-o buclă, evitând crearea excesivă de obiecte în memorie.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Laboratorul 1 - Aplicații Practice").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Laboratorul 1 - Aplicații Practice",
                    "Laboratoare", // Aceasta va crea automat categoria "Laboratoare" în dropdown
                    "Acest laborator conține exercițiile de bază pentru structuri alternative, operatori și array-uri. Descărcați arhiva completă de mai jos și rulați proiectul în IntelliJ.",
                    "isp-lab-1.zip"
            ));
        }
        if (lectieRepository.findByTitlu("Laboratorul 3 - OOP: Clase și Obiecte").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Laboratorul 3 - OOP: Clase și Obiecte",
                    "Laboratoare",
                    "Introducere în clase, constructori, metode și principii de bază OOP în Java.",
                    "isp-lab-3.zip"
            ));
        }
        if (lectieRepository.findByTitlu("Clasă și Obiect").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Clasă și Obiect",
                    "Clase și Obiecte",
                    "Ce este o clasă, cum se creează o instanță cu operatorul new și ce înseamnă valoarea null.",
                    """
                            // Declararea unei clase (Șablonul)
                            public class Student {
                                private String nume;
                                private int varsta;
        
                                public Student(String nume, int varsta) {
                                    this.nume = nume;
                                    this.varsta = varsta;
                                }
                            }
        
                            // Crearea obiectului (Instanțierea)
                            Student student1 = new Student("Ion", 20);
                            
                            // Referință null
                            Student student2 = null; // Nu indică spre niciun obiect
                            """,
                    """
                            1. Clasa este un șablon (blueprint) care definește atributele (datele) și comportamentul (metodele).
                            2. Obiectul este o instanță concretă creată pe baza acelui șablon.
                            3. Operatorul 'new' alocă memorie în Heap, execută constructorul și returnează adresa obiectului.
                            4. Cuvântul cheie 'null' arată că o variabilă de tip referință nu arată către nicio zonă din memorie (atenție la NullPointerException!).
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Atribute, this și static").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Atribute, this și static",
                    "Clase și Obiecte",
                    "Clasificarea atributelor, rolul variabilelor statice și utilizarea cuvântului cheie this.",
                    """
                            public class Persoana {
                                private String nume;             // Atribut de instanță
                                private static int contor = 0;   // Atribut static (de clasă)
                                private final String cnp;        // Atribut final (constantă)
        
                                public Persoana(String nume, String cnp) {
                                    this.nume = nume;            // 'this' rezolvă ambiguitatea numelui
                                    this.cnp = cnp;
                                    contor++;                    // Incrementează contorul comun
                                }
                                
                                public static int getContor() {
                                    return contor;
                                }
                            }
                            """,
                    """
                            1. Atribute de instanță: Fiecărui obiect îi aparține câte o copie a variabilei.
                            2. Atribute statice (static): Sunt comune pentru TOATE obiectele clasei și aparțin clasei în sine, nu instanțelor.
                            3. Atribute finale (final): Odată inițializate, valoarea lor nu mai poate fi modificată.
                            4. Cuvântul cheie 'this': Se referă la instanța curentă a clasei (folosit pentru dezambiguizare sau înlănțuire de metode).
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Constructori și Overloading").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Constructori și Overloading",
                    "Clase și Obiecte",
                    "Crearea constructorilor împlicitați și cu parametri, plus tehnica de supraîncărcare a metodelor.",
                    """
                            public class Carte {
                                private String titlu;
                                private int an;
        
                                // Constructor implicit
                                public Carte() {
                                    this("Fără titlu", 2000); // Apelează al doilea constructor cu 'this'
                                }
        
                                // Constructor cu parametri
                                public Carte(String titlu, int an) {
                                    this.titlu = titlu;
                                    this.an = an;
                                }
        
                                // Supraîncărcarea metodei (Overloading)
                                public void afiseazaInfo() {
                                    System.out.println(titlu + " - " + an);
                                }
        
                                public void afiseazaInfo(String prefix) {
                                    System.out.println(prefix + ": " + titlu);
                                }
                            }
                            """,
                    """
                            1. Constructorul este o metodă specială (fără tip returnat, cu numele identic cu clasa) apelată la 'new'.
                            2. Putem avea mai mulți constructori în aceeași clasă prin supraîncărcare (Overloading).
                            3. Overloading (Supraîncărcarea): Permite definirea mai multor metode cu ACELAȘI nume, dar cu parametri diferiți (ca număr sau ca tip). Tipul returnat NU diferențiază metodele!
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Accesibilitate și Comparare Obiecte").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Accesibilitate și Comparare Obiecte",
                    "Clase și Obiecte",
                    "Nivelurile de acces (public, private, protected), compararea cu equals() și funcționarea Garbage Collector-ului.",
                    """
                            public class Utilizator {
                                private String email; // Accesibil doar în clasă
        
                                @Override
                                public boolean equals(Object obj) {
                                    if (this == obj) return true;
                                    if (obj == null || getClass() != obj.getClass()) return false;
                                    Utilizator altul = (Utilizator) obj;
                                    return email != null && email.equals(altul.email);
                                }
                            }
                            
                            // Comparare:
                            // '==' compară adresele de memorie (referințele)
                            // 'equals()' compară conținutul obiectelor
                            """,
                    """
                            1. Modificatori de acces:
                               - private: Doar în interiorul clasei.
                               - default (fără specificator): Doar în cadrul aceluiași pachet.
                               - protected: În pachet și în subclase (moștenire).
                               - public: De oriunde.
                            2. Compararea obiectelor: Operatorul '==' verifică dacă două variabile arată spre aceeași adresă de memorie. Metoda 'equals()' trebuie suprascrisă pentru a compara valorile/conținutul real din obiecte.
                            3. Garbage Collector (GC): Procesul automat din fundalul Java care identifică și șterge obiectele devenite inaccesibile (fără referință) pentru a elibera memoria RAM.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Agregarea").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Agregarea",
                    "OOP",
                    "Relația de tip 'has-a' slabă (parte-din), unde obiectele conținute pot exista independent de container.",
                    """
                    import java.util.List;
                    import java.util.ArrayList;

                    public class Profesor {
                        private String nume;

                        public Profesor(String nume) {
                            this.nume = nume;
                        }

                        public String getNume() { return nume; }
                    }

                    public class Facultate {
                        private String denumire;
                        private List<Profesor> profesori; // Agregare: profesorii pot exista și fără facultate

                        public Facultate(String denumire, List<Profesor> profesori) {
                            this.denumire = denumire;
                            this.profesori = profesori;
                        }

                        public void afiseazaFacultate() {
                            System.out.println("Facultatea: " + denumire);
                            for (Profesor p : profesori) {
                                System.out.println(" - Profesor: " + p.getNume());
                            }
                        }
                    }
                    """,
                    """
                    Agregarea este o asociație slabă de tip 'are un'. Obiectul parte (Profesorul) este independent 
                    și nu își pierde existența dacă obiectul întreg (Facultatea) este distrus sau șters din memorie.
                    """
            ));
        }

        if (lectieRepository.findByTitlu("Compoziția").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Compoziția",
                    "OOP",
                    "Relația de tip 'has-a' puternică, unde obiectul component nu poate exista în afara containerului.",
                    """
                    public class Procesor {
                        private String model;
                        private double frecventa;

                        public Procesor(String model, double frecventa) {
                            this.model = model;
                            this.frecventa = frecventa;
                        }

                        public void descrieProcesor() {
                            System.out.println("Procesor: " + model + " (" + frecventa + " GHz)");
                        }
                    }

                    public class Laptop {
                        private String brand;
                        private final Procesor procesor; // Compoziție strictă (creat în interior)

                        public Laptop(String brand, String modelProcesor, double frecventa) {
                            this.brand = brand;
                            // Procesorul este creat direct în constructorul laptopului
                            this.procesor = new Procesor(modelProcesor, frecventa);
                        }

                        public void pornesteLaptop() {
                            System.out.println("Laptopul " + brand + " pornește...");
                            procesor.descrieProcesor();
                        }
                    }
                    """,
                    """
                    Compoziția reprezintă o relație strictă în care ciclul de viață al părților componente este controlat 
                    total de către obiectul container. Dacă obiectul Laptop este distrus, Procesorul este și el distrus odată cu el.
                    """
            ));
        }

        if (lectieRepository.findByTitlu("Moștenirea").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Moștenirea",
                    "OOP",
                    "Mecanismul prin care o clasă preia atributele și metodele alteia, folosind extends și super.",
                    """
                    public class Persoana {
                        protected String nume;
                        protected int varsta;

                        public Persoana(String nume, int varsta) {
                            this.nume = nume;
                            this.varsta = varsta;
                        }

                        public void afiseazaDetalii() {
                            System.out.println("Nume: " + nume + ", Vârstă: " + varsta);
                        }
                    }

                    public class Student extends Persoana {
                        private double medie;

                        public Student(String nume, int varsta, double medie) {
                            super(nume, varsta); // Apelăm constructorul din clasa părinte
                            this.medie = medie;
                        }

                        @Override
                        public void afiseazaDetalii() {
                            super.afiseazaDetalii(); // Refolosim logica din părinte
                            System.out.println("Media academică: " + medie);
                        }
                    }
                    """,
                    """
                    Moștenirea permite extinderea claselor existente (superclase) în clase noi (subclase) 
                    pentru a evita duplicarea codului și a crea ierarhii logice clare de tip 'is-a'.
                    """
            ));
        }

        if (lectieRepository.findByTitlu("Conversii de Tip").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Conversii de Tip",
                    "OOP",
                    "Conversii implicite (Upcasting) și explicite (Downcasting) în ierarhia de obiecte.",
                    """
                    public class TestCasting {
                        public static void main(String[] args) {
                            // 1. Upcasting: Conversie de la subclasă la superclasă (implicită și sigură)
                            Persoana p = new Student("Alex", 20, 9.6);
                            p.afiseazaDetalii(); // Funcționează polimorfic

                            // 2. Downcasting: Conversie de la superclasă la subclasă (explicită)
                            if (p instanceof Student s) { // Pattern matching cu instanceof (Java 16+)
                                System.out.println("S-a făcut downcasting cu succes pentru student!");
                                // Acum putem folosi variabile și metode specifice clasei Student
                            }
                        }
                    }
                    """,
                    """
                    1. Upcasting-ul este întotdeauna sigur deoarece un obiect copil este și un obiect părinte.
                    2. Downcasting-ul necesită o conversie explicită și este recomandat să fie validat 
                       în prealabil cu operatorul 'instanceof' pentru a preveni erorile de tip 'ClassCastException'.
                    """
            ));
        }
        if (lectieRepository.findByTitlu("Laboratorul 4 - OOP: Agregare, Mostenire, Compozitie").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Laboratorul 4 - OOP: Agregare, Mostenire, Compozitie",
                    "Laboratoare",
                    "Aplicații practice pentru concepte avansate OOP: Agregare, Compoziție, Moștenire și Conversii de tip.",
                    "isp-lab-4.zip"
            ));
        }
        // 1. Lecția: Clase Abstracte
        lectieRepository.save(new Lectie(
                "Clase Abstracte",
                "OOP",
                """
                O clasă abstractă servește drept șablon general și nu poate fi instanțiată direct cu 'new'. O clasă abstractă poate conține:
                - Atribute și constructori proprii (utilizați de subclase prin 'super').
                - Metode concrete (cu corp și implementare completă, moștenite direct).
                - Metode abstracte (fără corp, marcate cu 'abstract', care forțează obligatoriu subclasele să le suprascrie prin '@Override').
                """,
                """
                abstract class Animal {
                    String nume;
    
                    // Constructor în clasă abstractă
                    public Animal(String nume) {
                        this.nume = nume;
                    }
    
                    // Metodă concretă (cu implementare)
                    public void respira() {
                        System.out.println(nume + " respiră aer.");
                    }
    
                    // Metodă abstractă (fără corp, obligatoriu de implementat)
                    public abstract void sunet();
                }
    
                class Caine extends Animal {
                    public Caine(String nume) {
                        super(nume);
                    }
    
                    @Override
                    public void sunet() {
                        System.out.println(nume + " latră: Ham-ham!");
                    }
                }
                """,
                "Clasa 'Animal' este șablonul abstract: oferă gata scrisă metoda 'respira()' pentru toate animalele, dar o obligă pe subclasa 'Caine' să își definească propriul mod de a scoate sunete prin suprascrierea metodei abstracte 'sunet()'."
        ));

        // 2. Lecția: Interfețe
        lectieRepository.save(new Lectie(
                "Interfețe",
                "OOP",
                """
                O interfață reprezintă un contract strict care definește *ce* trebuie să facă o clasă, fără a impune *cum*. O interfață poate conține:
                - Metode abstracte (fără corp, implicite public abstract).
                - Metode 'default' (cu implementare predefinită, introduse din Java 8 pentru flexibilitate).
                - Metode statice.
                - Constante (publice, statice și finale).
                Spre deosebire de clase, o clasă poate implementa mai multe interfețe simultan, rezolvând limitarea moștenirii simple din Java.
                """,
                """
                interface Zburator {
                    void zboara(); // Metodă abstractă implicit
                }
    
                interface Inotator {
                    void inoata();
                }
    
                // O clasă implementează mai multe interfețe (moștenire multiplă de comportament)
                class Rata implements Zburator, Inotator {
                    @Override
                    public void zboara() {
                        System.out.println("Rața zboară la înălțime mică.");
                    }
    
                    @Override
                    public void inoata() {
                        System.out.println("Rața înoată pe lac.");
                    }
                }
                """,
                "Interfețele 'Zburator' și 'Inotator' funcționează ca niște comportamente modulare. Clasa 'Rata' le preia pe ambele prin 'implements', demonstrând cum o clasă poate dobândi capabilități multiple din surse diferite."
        ));

        // Lecția 1: Diagrame de clase UML - Relații structurale
        lectieRepository.save(new Lectie(
                "Relații Structurale în Diagramele UML (Compoziție, Agregare, Moștenire)",
                "OOP",
                "Această diagramă ilustrează o ierarhie orientată pe obiecte care modelează un autovehicul complet, compus din motoare și sisteme de alarmă.",
                "", // Fără bloc de cod Java, avem doar imaginea și explicațiile vizuale
                """
                Detalierea elementelor din diagramă:
        
                1. Compoziția (Romb plin): Conectează `Car` de `CarAlarm` (relație 'part-of' strictă; alarma nu poate exista independent de mașină).
        
                2. Agregarea (Romb gol): Conectează `Car` de `Engine` (relație 'has-a' mai slabă; motorul poate exista separat).
        
                3. Moștenirea (Săgeată goală): Clasele `DieselEngine` și `ElectricEngine` moștenesc clasa de bază `Engine` (preiau atributele și își definesc propriul `startEngine()`).
                """,
                "/Diagrama1.jpg"
        ));
        lectieRepository.save(new Lectie(
                "Relații Aprofundate în Diagramele UML: Implementare și Dependență",
                "OOP",
                "Această lecție detaliază relațiile avansate din UML: Implementarea de interfețe (Realization) și Dependența dintre clase.",
                "",
                """
                Detalierea elementelor și a relațiilor UML:
        
                1. Implementarea / Realizarea (Săgeată cu linie întreruptă și vârf triunghiular gol): 
                - Conectează clasele concrete (ex: `CashPayment`, `CardPayment`) la interfața `PaymentGateway`. Indică faptul că aceste clase implementează efectiv comportamentul definit în contractul interfeței (`executePayment`).
        
                2. Dependența (Săgeată cu linie întreruptă simplă): 
                - Arată că o clasă depinde temporar sau folosește o altă clasă (de exemplu, `UserApp` folosește `PaymentGateway` sau `Ticket` ca parametru într-o metodă). O schimbare în clasa utilizată poate afecta clasa client.
        
                3. Compoziția și Agregarea (Reamintire): 
                - Compoziția (romb plin - relație strictă 'part-of') vs Agregarea (romb gol - relație slabă 'has-a').
                """,
                "/Diagrama2.jpg"
        ));
        if (lectieRepository.findByTitlu("Laboratorul 5 - Implementare Cod după Diagrame de Clase").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Laboratorul 5 - Implementare Cod după Diagrame de Clase",
                    "Laboratoare",
                    "Implementarea practică în Java a claselor, interfețelor și a relațiilor (compoziție, agregare, moștenire, dependență) plecând de la diagramele de clase UML furnizate.",
                    "isp-lab-5.zip"
            ));
        }
    }
}