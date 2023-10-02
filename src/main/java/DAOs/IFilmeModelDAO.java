package DAOs;

import Models.FilmeModel;

import java.util.List;

public interface IFilmeModelDAO {
    //List<Integer> findByName(String titulo);
    FilmeModel findByTitulo(String titulo);
    List<FilmeModel> findAll();

    boolean insert(FilmeModel f);
    boolean update(FilmeModel f);
    boolean delete(FilmeModel f);
}
