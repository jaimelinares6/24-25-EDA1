package entregas.linaresJaime.Reto004;

public class Biblioteca {
        private Lista cancionesFavoritas;
        private Lista playlists;
    
        public Biblioteca() {
            this.cancionesFavoritas = new Lista();
            this.playlists = new Lista();
        }
        
        private Playlist obtenerPlaylistPorIndice(int indice) {
            Node iterator = playlists.getFirst();
            int count = 0;
            
            while (iterator != null) {
                if (count == indice) {
                    return (Playlist) iterator.getValue();
                }
                count++;
                iterator = iterator.getNext();
            }
            return null;
        }
    
        public void anadirAFavoritos(Cancion cancion) {
            if (!cancionEsFavorita(cancion)) {
                cancion.favorita();
                cancionesFavoritas.insertEnd(cancion);
                System.out.println("Canción añadida a favoritos.");
            } else {
                System.out.println("La canción ya está en favoritos.");
            }
        }
    
        public void eliminarDeFavoritos(int indiceCancion) {
            Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
            if (playlist != null) {
            }
            System.out.println("Índice de canción inválido.");
        }
    
        public void verCancionesFavoritas() {
            System.out.println("=== Canciones Favoritas ===");
            System.out.println(cancionesFavoritas.listAll());
        }
    
        public void crearPlaylist(String titulo) {
            Playlist nuevaPlaylist = new Playlist(titulo);
            playlists.insertEnd(nuevaPlaylist);
            System.out.println("Nueva playlist '" + titulo + "' creada.");
        }
    
        public void eliminarPlaylist(int indice) {
            Lista nuevaLista = new Lista();
            Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
                if (playlist != null) {
                }
            playlists = nuevaLista;
            System.out.println("Playlist eliminada.");
        }
    
        public void anadirCancionAPlaylist(int indicePlaylist, Cancion cancion) {
            Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
                if (playlist != null) {
                }
            System.out.println("Índice de playlist inválido.");
        }
    
        public void crearCancionYAnadir(int indicePlaylist, String titulo, String artista, int duracion) {
             Cancion cancion = new Cancion(titulo, artista, duracion);
             anadirCancionAPlaylist(indicePlaylist, cancion);
        }
    
        public void eliminarCancionDePlaylist(int indicePlaylist, int indiceCancion) {
            Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
                if (playlist != null) {
                }
    
            System.out.println("Índice de playlist inválido.");
        }
    
        public void verPlaylists() {
            System.out.println("=== Playlists ===");
            Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
                if (playlist != null) {
                }
        }
    
        public Playlist obtenerPlaylist(int indice) {
            Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
                if (playlist != null) {
                }
            return null;
        }
    
        public Playlist seleccionarPlaylistParaReproduccion(int indice) {
            return obtenerPlaylist(indice);
        }
    
        public String verCancionesDePlaylist(int indicePlaylist) {
            Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
                if (playlist != null) {
                }
            return "Índice de playlist inválido.";
        }
    
        private boolean cancionEsFavorita(Cancion cancion) {
            Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
                if (playlist != null) {
                }
            return false;
        }
}
