package bo.edu.udabol.iaaigaf.repositorio;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import bo.edu.udabol.iaaigaf.modelo.Activosfijos;

@Mapper
public interface ActivosfijosRepositorio {

    @Select("select * from activosfijos")
    List<Activosfijos> obtenerTodos();
}
