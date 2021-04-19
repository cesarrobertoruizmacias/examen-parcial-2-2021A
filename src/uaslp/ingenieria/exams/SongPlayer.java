package uaslp.ingenieria.exams;
import uaslp.ingenieria.exams.instruments.*;
import java.util.Iterator;

import static uaslp.ingenieria.exams.Instrumento.*;

public class SongPlayer<G> {

    public void play(Song song, Instrumento instrumento) {

        Iterator<Nota> notas = song.getSongIterator();
        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();

        while (notas.hasNext()) {
            Nota nota;
            nota = notas.next();

            switch (instrumento) {
                case PIANO -> piano.presionaTecla(nota);
                case FLAUTA -> flauta.sopla(nota);
                case VIOLIN -> violin.toca(nota);
                case GUITARRA -> guitarra.tocaCuerda(nota);
                default -> System.out.println("Instrumento no soportado");
            }
        }

    }

}
