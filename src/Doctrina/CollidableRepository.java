package Doctrina;

import java.util.*;
import java.util.function.Consumer;

public class CollidableRepository implements Iterable<StaticEntity> {
    private static CollidableRepository instance;

    private final List<StaticEntity> registredEntities;


    private CollidableRepository() {
        // private to prevent class creation
        registredEntities = new ArrayList<>();
    }

    public static CollidableRepository getInstance() {
        if (instance == null){
            instance = new CollidableRepository();
        }
        return instance;
    }

    public void registredEntity(StaticEntity entity){
        registredEntities.add(entity);
    }
    public void unRegistredEntity(StaticEntity entity){
        registredEntities.remove(entity);
    }

    public void registredEntities(Collection<StaticEntity> entities){
        registredEntities.addAll(entities);
    }

    public void unRegistredEntities(Collection<StaticEntity> entities){
        registredEntities.removeAll(entities);
    }

    public int count(){
        return registredEntities.size();
    }
    @Override
    public Iterator<StaticEntity> iterator() {
        return registredEntities.iterator();
    }



}
