/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud;

import java.io.Serializable;
import java.util.Random;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import richtercloud.javaee.data.source.in.application.xml.jar.MyEntity;
import richtercloud.javaee.data.source.in.application.xml.jar.SaveController;

/**
 *
 * @author richter
 */
@ManagedBean
public class MyManagedBean implements Serializable {
    private static final long serialVersionUID = 1L;
    @EJB
    private SaveController saveController;
    private final Random random = new Random();

    public String save() {
        MyEntity myEntity = new MyEntity(String.valueOf(random.nextInt()));
        saveController.save(myEntity);
        return "";
    }
}
