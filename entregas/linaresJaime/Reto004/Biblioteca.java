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
        if (cancionEsFavorita(cancion)) {
            System.out.println("La canción ya está en favoritos.");
            return;
        }
        cancion.favorita();
        cancionesFavoritas.insertEnd(cancion);
        System.out.println("Canción añadida a favoritos.");
    }

    public void eliminarDeFavoritos(int indiceCancion) {
        if (cancionesFavoritas.removeAt(indiceCancion)) {
            System.out.println("Canción eliminada de favoritos.");
        } else {
            System.out.println("Índice de canción inválido.");
        }
    }

    public void crearPlaylist(String titulo) {
        playlists.insertEnd(new Playlist(titulo));
        System.out.println("Nueva playlist '" + titulo + "' creada.");
    }

    public void eliminarPlaylist(int indice) {
        if (playlists.removeAt(indice)) {
            System.out.println("Playlist eliminada.");
        } else {
            System.out.println("Índice de playlist inválido.");
        }
    }

    public void anadirCancionAPlaylist(int indicePlaylist, Cancion cancion) {
        Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
        if (playlist == null) {
            System.out.println("Índice de playlist inválido.");
            return;
        }
        playlist.anadirCancion(cancion);
    }

    public void eliminarCancionDePlaylist(int indicePlaylist, int indiceCancion) {
        Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
        if (playlist == null) {
            System.out.println("Índice de playlist inválido.");
            return;
        }
        playlist.eliminarCancion(indiceCancion);
    }

    public String verCancionesDePlaylist(int indicePlaylist) {
        Playlist playlist = obtenerPlaylistPorIndice(indicePlaylist);
        if (playlist == null) {
            return "Índice de playlist inválido.";
        }
        return playlist.listarCanciones();
    }

    private boolean cancionEsFavorita(Cancion cancion) {
        return false; 
    }

    public void verCancionesFavoritas() {
        System.out.println("=== Canciones Favoritas ===");
        System.out.println(cancionesFavoritas.listAll());
    }

    public void verPlaylists() {
        System.out.println("=== Playlists ===");
        System.out.println(playlists.listAll());
    }
}