package src.main.data;

import javafx.collections.ObservableList;
import src.main.classes.Spiel;

import java.util.List;

public class SpieleDao {
    private List<Spiel> spiele;

    public SpieleDao(List<Spiel> spiele) {
        this.spiele = spiele;
    }

    public List<Spiel> getAll() {
        return spiele;
    }

    public Spiel getSpielById(int id) {
        for (Spiel spiel : spiele) {
            if (spiel.getId() == id) {
                return spiel;
            }
        }
        return null;
    }

    public void add(Spiel spiel) {
        spiele.add(spiel);
    }

    public void update(Spiel spiel) {
        // TODO
    }

    public void delete(Spiel spiel) {
        System.out.println("SpieleDao: delete Spiel: " + spiel.toString());
        spiele.remove(spiel);
    }

    public void deleteById(int id) {
        System.out.println("SpieleDao: delete Spiel by id: " + id);
        for (Spiel spiel : spiele) {
            if (spiel.getId() == id) {
                spiele.remove(spiel);
            }
        }
        System.out.println("Printing all games after deleting: ");
        System.out.println(spiele.toString());
    }
}