package DAOs;

import Models.FilmeModel;

import java.util.List;

public interface IFilmeModelDAO {
    FilmeModel findById(int id);
    List<FilmeModel> findByGeneroTitulo(String generoTitulo);
    FilmeModel findByTitulo(String titulo);
    List<FilmeModel> findAll();

    boolean insert(FilmeModel f);
    boolean update(FilmeModel f);
    boolean delete(FilmeModel f);
}
