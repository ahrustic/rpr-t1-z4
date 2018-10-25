package ba.unsa.etf.rpr.tutorijal1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testKonstruktora() {
        Student noviStudent = new Student("Mujo", "Mujic", 12345);
        assertEquals("Mujo Mujic 12345",noviStudent.toString());
    }

    @Test
    void postavi() {
        Student noviStudent = new Student("Perica", "Peric", 18101);
        noviStudent.postavi("Janko", "Janic", 56889);
        assertEquals("Janko Janic 56889", noviStudent.toString());
    }

    @Test
    void obrisiStudenta() {
    }

    @Test
    void dajImeStudenta() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        String ime = novi.dajImeStudenta();
        assertEquals ("Mujo", ime);
    }

    @Test
    void dajImeStudentaNeispravno() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        assertThrows(IllegalArgumentException.class, () -> {novi.dajImeStudenta();});
    }

    @Test
    void dajPrezimeStudenta() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        String prezime = novi.dajPrezimeStudenta();
        assertEquals ("Mujic", prezime);
    }

    @Test
    void dajImePrezimeStudentaNeispravno() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        assertThrows(IllegalArgumentException.class, () -> {novi.dajPrezimeStudenta();});
    }

    @Test
    void dajBrojIndeksaStudenta() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        int index = novi.dajBrojIndeksaStudenta();
        assertEquals (12345, index);
    }

    @Test
    void dajBrojIndexaStudentaNeispravno() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        assertThrows(IllegalArgumentException.class, () -> {novi.dajBrojIndeksaStudenta();});
    }

    @Test
    void promjeniImeStudenta() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        novi.promjeniImeStudenta((new Student ("Janko", "Janic", 56889)));
        assertEquals("Maja Mujic 12345",novi.toString());
    }

    @Test
    void testPostaviImePredmetaNeispravan() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        assertThrows(IllegalArgumentException.class, () -> novi.promjeniImeStudenta((new Student ("Janko", "Janic", 56889))));
    }

    @Test
    void promjeniPrezimeStudenta() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        novi.promjeniPrezimeStudenta((new Student ("Janko", "Janic", 56889)));
        assertEquals("Mujo Mujica 12345",novi.toString());
    }

    @Test
    void testPostaviPrezimeNeispravan() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        assertThrows(IllegalArgumentException.class, () -> novi.promjeniPrezimeStudenta((new Student ("Janko", "Janic", 56889))));
    }

    @Test
    void promjeniBrojIndeksaStudenta() {
        Student noviPredmet = new Student("Mujo", "Mujic", 12345);
        noviPredmet.promjeniBrojIndeksaStudenta((new Student ("Janko", "Janic", 56889)));
        assertEquals("Mujo Mujic 54321",noviPredmet.toString());
    }

    @Test
    void testPostaviBrojIndexaNeispravan() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        assertThrows(IllegalArgumentException.class, () -> novi.promjeniBrojIndeksaStudenta(new Student("Mujo", "Mujic", 99999)));
    }

    @Test
    void testPostaviImeNeispravan() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        assertThrows(IllegalArgumentException.class, () -> novi.promjeniBrojIndeksaStudenta((new Student ("Janko", "Janic", 56889))));
    }

    @Test
    void ispisiNeispravno() {
        Student novi = new Student("Mujo", "Mujic", 12345);
        assertThrows(IllegalArgumentException.class, () -> novi.ispisi());
    }
}