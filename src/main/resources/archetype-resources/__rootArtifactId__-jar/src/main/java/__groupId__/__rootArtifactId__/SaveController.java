/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.javaee.data.source.in.application.xml.jar;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author richter
 */
@Local
public interface SaveController {

    void save(MyEntity myEntity);

    List<MyEntity> getAllMyEntities();
}
