package ba.unsa.etf.rpr.tutorijal1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void testKonstruktora() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        assertEquals("Razvoj programskih rješenja RPR 150",noviPredmet.toString());
    }

    @Test
    void postavi() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        noviPredmet.postavi("Diskretna matematika", "DM", 100);
        assertEquals("Diskretna matematika DM 100", noviPredmet.toString());
    }

    @Test
    void upisi() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        assertThrows(IllegalArgumentException.class, () -> {noviPredmet.upisi(new Student("Mujo", "Mujic", 12345));});
    }

    @Test
    void ispisani() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        assertThrows(IllegalArgumentException.class, () -> {noviPredmet.ispisani(new Student("Mujo", "Mujic", 12345));});
    }

    @Test
    void dajNazivPredmeta() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        assertThrows(IllegalArgumentException.class, () -> {noviPredmet.dajNazivPredmeta();});
    }

    @Test
    void dajSifruPredmeta() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        assertThrows(IllegalArgumentException.class, () -> {noviPredmet.dajSifruPredmeta();});
    }

    @Test
    void dajMaksimalanBrojStudenata() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        assertThrows(IllegalArgumentException.class, () -> {noviPredmet.dajMaksimalanBrojStudenata();});
    }

    /*@Test
    void izbrisiPredmet() {
    }*/

    @Test
    void promjeniNazivStudenta() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        noviPredmet.promjeniNazivPredmeta(new Predmet("Diskretna matematika", "DM", 100));
        assertEquals("Diskretna matematika RPR 150",noviPredmet.toString());
    }

    @Test
    void promjeniSifruPredmeta() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        noviPredmet.promjeniNazivPredmeta(new Predmet("Diskretna matematika", "DM", 100));
        assertEquals("Razvoj programskih rješenja DM 150",noviPredmet.toString());
    }

    @Test
    void ispisStudenteNaPredmetu() {
        Predmet noviPredmet = new Predmet("Razvoj programskih rješenja", "RPR", 150);
        assertThrows(IllegalArgumentException.class, () -> {noviPredmet.ispisStudenteNaPredmetu();});
    }

}