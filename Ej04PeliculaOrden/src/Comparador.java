import java.util.Comparator;

public class Comparador {
    public static Comparator<Pelicula> minToMaxDuracion = new Comparator<Pelicula>(){
      public int compare(Pelicula o1, Pelicula o2){
          return o1.getDuracion().compareTo(o2.getDuracion());
      }
    };
    public static Comparator<Pelicula> maxToMinDuracion = new Comparator<Pelicula>(){
        public int compare(Pelicula o1, Pelicula o2){
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    public static Comparator<Pelicula> titulo = new Comparator<Pelicula>(){
        public int compare(Pelicula o1, Pelicula o2){
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    public static Comparator<Pelicula> director = new Comparator<Pelicula>(){
        public int compare(Pelicula o1, Pelicula o2){
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}
