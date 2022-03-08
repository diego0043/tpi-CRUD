package com.mycompany.baches.entity.resources;

import com.mycompany.baches.entity.resources.ObjetoEstado;
import com.mycompany.baches.entity.resources.TipoObjeto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-06T23:31:13", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Objeto.class)
public class Objeto_ { 

    public static volatile SingularAttribute<Objeto, Double> longitud;
    public static volatile SingularAttribute<Objeto, Double> latitud;
    public static volatile SingularAttribute<Objeto, TipoObjeto> idTipoObjeto;
    public static volatile SingularAttribute<Objeto, Integer> idObjeto;
    public static volatile SingularAttribute<Objeto, String> observaciones;
    public static volatile SingularAttribute<Objeto, String> nombre;
    public static volatile ListAttribute<Objeto, ObjetoEstado> objetoEstadoList;

}