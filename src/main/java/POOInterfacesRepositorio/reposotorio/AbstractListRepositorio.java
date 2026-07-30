package POOInterfacesRepositorio.reposotorio;

import POOInterfacesRepositorio.modelo.BaseEntity;
import POOInterfacesRepositorio.reposotorio.excepciones.EscrituraAccesoDatoException;
import POOInterfacesRepositorio.reposotorio.excepciones.LecturaAccesoDatoException;
import POOInterfacesRepositorio.reposotorio.excepciones.RegistroDuplicadoAccesoDatosException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {

    protected List<T> dataSource;

    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException {
        if (id == null || id <=0){
            throw new LecturaAccesoDatoException("ID Inválido, debe ser mayor a 0");
        }
        T resultado = null;
        for(T cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        if (resultado == null){
            throw new LecturaAccesoDatoException("No existe el registro con Id"+ id );
        }
        return resultado;
    }

    @Override
    public void insertar(T cliente) throws EscrituraAccesoDatoException  {

        if (cliente == null){
            throw new EscrituraAccesoDatoException("No se puede agregar un registro null");
        }
        if (this.dataSource.contains(cliente)){
            throw new RegistroDuplicadoAccesoDatosException("Ya existe el ID: "+ cliente.getId());
        }
        this.dataSource.add(cliente);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException{
        this.dataSource.remove(this.porId(id));
    }


    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}