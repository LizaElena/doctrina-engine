package Doctrina;

public abstract class ControllableEntity extends MovableEntity{

    private final MouvementController controller;

    public ControllableEntity(MouvementController controller) {
        this.controller = controller;
    }

    public void moveWithController(){
        if (controller.isMoving()){
            move(controller.getDirection());
        }
    }
}
