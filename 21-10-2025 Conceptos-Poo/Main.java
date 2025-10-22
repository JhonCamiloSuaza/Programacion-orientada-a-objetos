package poo;

public class Main {
    public static void main(String[] args) {
        Silla silla1 = new Silla("m1", "c1", true);
        silla1.mostrarInfo();
        silla1.ocupar();
        silla1.desocupar();

        Silla silla2 = new Silla("m2", "c2", false);
        silla2.mostrarInfo();
        silla2.ocupar();
        silla2.desocupar();

        Silla silla3 = new Silla("m3", "c3", true);
        silla3.mostrarInfo();
        silla3.ocupar();
        silla3.desocupar();

        Silla silla4 = new Silla("m4", "c4", false);
        silla4.mostrarInfo();
        silla4.ocupar();
        silla4.desocupar();

        Silla silla5 = new Silla("m5", "c5", true);
        silla5.mostrarInfo();
        silla5.ocupar();
        silla5.desocupar();

        Mesa mesa1 = new Mesa("m1", 10, "c1");
        mesa1.mostrarInfo();
        mesa1.limpiar();
        mesa1.usar();

        Mesa mesa2 = new Mesa("m2", 20, "c2");
        mesa2.mostrarInfo();
        mesa2.limpiar();
        mesa2.usar();

        Mesa mesa3 = new Mesa("m3", 30, "c3");
        mesa3.mostrarInfo();
        mesa3.limpiar();
        mesa3.usar();

        Mesa mesa4 = new Mesa("m4", 40, "c4");
        mesa4.mostrarInfo();
        mesa4.limpiar();
        mesa4.usar();

        Mesa mesa5 = new Mesa("m5", 50, "c5");
        mesa5.mostrarInfo();
        mesa5.limpiar();
        mesa5.usar();

        Estudiante estudiante1 = new Estudiante("nombre1", 1, "grado1");
        estudiante1.mostrarInfo();
        estudiante1.estudiar();
        estudiante1.participar();

        Estudiante estudiante2 = new Estudiante("nombre2", 2, "grado2");
        estudiante2.mostrarInfo();
        estudiante2.estudiar();
        estudiante2.participar();

        Estudiante estudiante3 = new Estudiante("nombre3", 3, "grado3");
        estudiante3.mostrarInfo();
        estudiante3.estudiar();
        estudiante3.participar();

        Estudiante estudiante4 = new Estudiante("nombre4", 4, "grado4");
        estudiante4.mostrarInfo();
        estudiante4.estudiar();
        estudiante4.participar();

        Estudiante estudiante5 = new Estudiante("nombre5", 5, "grado5");
        estudiante5.mostrarInfo();
        estudiante5.estudiar();
        estudiante5.participar();

        Profesor profesor1 = new Profesor("nombre1", "materia1", 1);
        profesor1.mostrarInfo();
        profesor1.ensenar();
        profesor1.calificar();

        Profesor profesor2 = new Profesor("nombre2", "materia2", 2);
        profesor2.mostrarInfo();
        profesor2.ensenar();
        profesor2.calificar();

        Profesor profesor3 = new Profesor("nombre3", "materia3", 3);
        profesor3.mostrarInfo();
        profesor3.ensenar();
        profesor3.calificar();

        Profesor profesor4 = new Profesor("nombre4", "materia4", 4);
        profesor4.mostrarInfo();
        profesor4.ensenar();
        profesor4.calificar();

        Profesor profesor5 = new Profesor("nombre5", "materia5", 5);
        profesor5.mostrarInfo();
        profesor5.ensenar();
        profesor5.calificar();

        Puerta puerta1 = new Puerta("material1", "color1", true);
        puerta1.mostrarInfo();
        puerta1.abrir();
        puerta1.cerrar();

        Puerta puerta2 = new Puerta("material2", "color2", false);
        puerta2.mostrarInfo();
        puerta2.abrir();
        puerta2.cerrar();

        Puerta puerta3 = new Puerta("material3", "color3", true);
        puerta3.mostrarInfo();
        puerta3.abrir();
        puerta3.cerrar();

        Puerta puerta4 = new Puerta("material4", "color4", false);
        puerta4.mostrarInfo();
        puerta4.abrir();
        puerta4.cerrar();

        Puerta puerta5 = new Puerta("material5", "color5", true);
        puerta5.mostrarInfo();
        puerta5.abrir();
        puerta5.cerrar();

        Ventana ventana1 = new Ventana("tipo1", "tamanio1", "material1");
        ventana1.mostrarInfo();
        ventana1.abrir();
        ventana1.cerrar();

        Ventana ventana2 = new Ventana("tipo2", "tamanio2", "material2");
        ventana2.mostrarInfo();
        ventana2.abrir();
        ventana2.cerrar();

        Ventana ventana3 = new Ventana("tipo3", "tamanio3", "material3");
        ventana3.mostrarInfo();
        ventana3.abrir();
        ventana3.cerrar();

        Ventana ventana4 = new Ventana("tipo4", "tamanio4", "material4");
        ventana4.mostrarInfo();
        ventana4.abrir();
        ventana4.cerrar();

        Ventana ventana5 = new Ventana("tipo5", "tamanio5", "material5");
        ventana5.mostrarInfo();
        ventana5.abrir();
        ventana5.cerrar();

        Computador computador1 = new Computador("marca1", 1, "modelo1");
        computador1.mostrarInfo();
        computador1.encender();
        computador1.apagar();

        Computador computador2 = new Computador("marca2", 2, "modelo2");
        computador2.mostrarInfo();
        computador2.encender();
        computador2.apagar();

        Computador computador3 = new Computador("marca3", 3, "modelo3");
        computador3.mostrarInfo();
        computador3.encender();
        computador3.apagar();

        Computador computador4 = new Computador("marca4", 4, "modelo4");
        computador4.mostrarInfo();
        computador4.encender();
        computador4.apagar();

        Computador computador5 = new Computador("marca5", 5, "modelo5");
        computador5.mostrarInfo();
        computador5.encender();
        computador5.apagar();

        Luz luz1 = new Luz(true, 1);
        luz1.mostrarInfo();
        luz1.encender();
        luz1.apagar();

        Luz luz2 = new Luz(false, 2);
        luz2.mostrarInfo();
        luz2.encender();
        luz2.apagar();

        Luz luz3 = new Luz(true, 3);
        luz3.mostrarInfo();
        luz3.encender();
        luz3.apagar();

        Luz luz4 = new Luz(false, 4);
        luz4.mostrarInfo();
        luz4.encender();
        luz4.apagar();

        Luz luz5 = new Luz(true, 5);
        luz5.mostrarInfo();
        luz5.encender();
        luz5.apagar();

        Aire aire1 = new Aire(1, "marca1", "tamanio1");
        aire1.mostrarInfo();
        aire1.encender();
        aire1.apagar();

        Aire aire2 = new Aire(2, "marca2", "tamanio2");
        aire2.mostrarInfo();
        aire2.encender();
        aire2.apagar();

        Aire aire3 = new Aire(3, "marca3", "tamanio3");
        aire3.mostrarInfo();
        aire3.encender();
        aire3.apagar();

        Aire aire4 = new Aire(4, "marca4", "tamanio4");
        aire4.mostrarInfo();
        aire4.encender();
        aire4.apagar();

        Aire aire5 = new Aire(5, "marca5", "tamanio5");
        aire5.mostrarInfo();
        aire5.encender();
        aire5.apagar();

        Cuaderno cuaderno1 = new Cuaderno("color1", 1, "tamano1");
        cuaderno1.mostrarInfo();
        cuaderno1.organizarInformacion();
        cuaderno1.planificar();

        Cuaderno cuaderno2 = new Cuaderno("color2", 2, "tamano2");
        cuaderno2.mostrarInfo();
        cuaderno2.organizarInformacion();
        cuaderno2.planificar();

        Cuaderno cuaderno3 = new Cuaderno("color3", 3, "tamano3");
        cuaderno3.mostrarInfo();
        cuaderno3.organizarInformacion();
        cuaderno3.planificar();

        Cuaderno cuaderno4 = new Cuaderno("color4", 4, "tamano4");
        cuaderno4.mostrarInfo();
        cuaderno4.organizarInformacion();
        cuaderno4.planificar();

        Cuaderno cuaderno5 = new Cuaderno("color5", 5, "tamano5");
        cuaderno5.mostrarInfo();
        cuaderno5.organizarInformacion();
        cuaderno5.planificar();

        Lapiz lapiz1 = new Lapiz("color1", "tipo1", 101);
        lapiz1.mostrarInfo();
        lapiz1.escribir();
        lapiz1.sacarPunta();

        Lapiz lapiz2 = new Lapiz("color2", "tipo2", 201);
        lapiz2.mostrarInfo();
        lapiz2.escribir();
        lapiz2.sacarPunta();

        Lapiz lapiz3 = new Lapiz("color3", "tipo3", 301);
        lapiz3.mostrarInfo();
        lapiz3.escribir();
        lapiz3.sacarPunta();

        Lapiz lapiz4 = new Lapiz("color4", "tipo4", 401);
        lapiz4.mostrarInfo();
        lapiz4.escribir();
        lapiz4.sacarPunta();

        Lapiz lapiz5 = new Lapiz("color5", "tipo5", 501);
        lapiz5.mostrarInfo();
        lapiz5.escribir();
        lapiz5.sacarPunta();

        Borrador borrador1 = new Borrador("color1", "forma1", "material1");
        borrador1.mostrarInfo();
        borrador1.borrar();
        borrador1.limpiar();

        Borrador borrador2 = new Borrador("color2", "forma2", "material2");
        borrador2.mostrarInfo();
        borrador2.borrar();
        borrador2.limpiar();

        Borrador borrador3 = new Borrador("color3", "forma3", "material3");
        borrador3.mostrarInfo();
        borrador3.borrar();
        borrador3.limpiar();

        Borrador borrador4 = new Borrador("color4", "forma4", "material4");
        borrador4.mostrarInfo();
        borrador4.borrar();
        borrador4.limpiar();

        Borrador borrador5 = new Borrador("color5", "forma5", "material5");
        borrador5.mostrarInfo();
        borrador5.borrar();
        borrador5.limpiar();

        Bolso bolso1 = new Bolso("color1", "tamano1", 110);
        bolso1.mostrarInfo();
        bolso1.guardar();
        bolso1.abrir();

        Bolso bolso2 = new Bolso("color2", "tamano2", 210);
        bolso2.mostrarInfo();
        bolso2.guardar();
        bolso2.abrir();

        Bolso bolso3 = new Bolso("color3", "tamano3", 310);
        bolso3.mostrarInfo();
        bolso3.guardar();
        bolso3.abrir();

        Bolso bolso4 = new Bolso("color4", "tamano4", 410);
        bolso4.mostrarInfo();
        bolso4.guardar();
        bolso4.abrir();

        Bolso bolso5 = new Bolso("color5", "tamano5", 510);
        bolso5.mostrarInfo();
        bolso5.guardar();
        bolso5.abrir();

        Reloj reloj1 = new Reloj("marca1", "hora1", "tipo1");
        reloj1.mostrarInfo();
        reloj1.mostrarHora();
        reloj1.mostrarDia();

        Reloj reloj2 = new Reloj("marca2", "hora2", "tipo2");
        reloj2.mostrarInfo();
        reloj2.mostrarHora();
        reloj2.mostrarDia();

        Reloj reloj3 = new Reloj("marca3", "hora3", "tipo3");
        reloj3.mostrarInfo();
        reloj3.mostrarHora();
        reloj3.mostrarDia();

        Reloj reloj4 = new Reloj("marca4", "hora4", "tipo4");
        reloj4.mostrarInfo();
        reloj4.mostrarHora();
        reloj4.mostrarDia();

        Reloj reloj5 = new Reloj("marca5", "hora5", "tipo5");
        reloj5.mostrarInfo();
        reloj5.mostrarHora();
        reloj5.mostrarDia();

        Piso piso1 = new Piso("material1", "color1", "tamanio1");
        piso1.mostrarInfo();
        piso1.limpiar();
        piso1.ensuciar();

        Piso piso2 = new Piso("material2", "color2", "tamanio2");
        piso2.mostrarInfo();
        piso2.limpiar();
        piso2.ensuciar();

        Piso piso3 = new Piso("material3", "color3", "tamanio3");
        piso3.mostrarInfo();
        piso3.limpiar();
        piso3.ensuciar();

        Piso piso4 = new Piso("material4", "color4", "tamanio4");
        piso4.mostrarInfo();
        piso4.limpiar();
        piso4.ensuciar();

        Piso piso5 = new Piso("material5", "color5", "tamanio5");
        piso5.mostrarInfo();
        piso5.limpiar();
        piso5.ensuciar();

        Pared pared1 = new Pared("color1", "material1", 100, 100);
        pared1.mostrarInfo();
        pared1.pintar();
        pared1.medir();

        Pared pared2 = new Pared("color2", "material2", 200, 200);
        pared2.mostrarInfo();
        pared2.pintar();
        pared2.medir();

        Pared pared3 = new Pared("color3", "material3", 300, 300);
        pared3.mostrarInfo();
        pared3.pintar();
        pared3.medir();

        Pared pared4 = new Pared("color4", "material4", 400, 400);
        pared4.mostrarInfo();
        pared4.pintar();
        pared4.medir();

        Pared pared5 = new Pared("color5", "material5", 500, 500);
        pared5.mostrarInfo();
        pared5.pintar();
        pared5.medir();

        Basurero basurero1 = new Basurero("color1", "tamanio1", true);
        basurero1.mostrarInfo();
        basurero1.llenar();
        basurero1.vaciar();

        Basurero basurero2 = new Basurero("color2", "tamanio2", false);
        basurero2.mostrarInfo();
        basurero2.llenar();
        basurero2.vaciar();

        Basurero basurero3 = new Basurero("color3", "tamanio3", true);
        basurero3.mostrarInfo();
        basurero3.llenar();
        basurero3.vaciar();

        Basurero basurero4 = new Basurero("color4", "tamanio4", false);
        basurero4.mostrarInfo();
        basurero4.llenar();
        basurero4.vaciar();

        Basurero basurero5 = new Basurero("color5", "tamanio5", true);
        basurero5.mostrarInfo();
        basurero5.llenar();
        basurero5.vaciar();

        TomaCorriente tomacorriente1 = new TomaCorriente(1, "color1");
        tomacorriente1.mostrarInfo();
        tomacorriente1.conectar();
        tomacorriente1.desconectar();

        TomaCorriente tomacorriente2 = new TomaCorriente(2, "color2");
        tomacorriente2.mostrarInfo();
        tomacorriente2.conectar();
        tomacorriente2.desconectar();

        TomaCorriente tomacorriente3 = new TomaCorriente(3, "color3");
        tomacorriente3.mostrarInfo();
        tomacorriente3.conectar();
        tomacorriente3.desconectar();

        TomaCorriente tomacorriente4 = new TomaCorriente(4, "color4");
        tomacorriente4.mostrarInfo();
        tomacorriente4.conectar();
        tomacorriente4.desconectar();

        TomaCorriente tomacorriente5 = new TomaCorriente(5, "color5");
        tomacorriente5.mostrarInfo();
        tomacorriente5.conectar();
        tomacorriente5.desconectar();

        Salon salon1 = new Salon("nombre1", 1, "ubicacion1");
        salon1.mostrarInfo();
        salon1.ambienteEducativo();
        salon1.lugarDeAprendizaje();

        Salon salon2 = new Salon("nombre2", 2, "ubicacion2");
        salon2.mostrarInfo();
        salon2.ambienteEducativo();
        salon2.lugarDeAprendizaje();

        Salon salon3 = new Salon("nombre3", 3, "ubicacion3");
        salon3.mostrarInfo();
        salon3.ambienteEducativo();
        salon3.lugarDeAprendizaje();

        Salon salon4 = new Salon("nombre4", 4, "ubicacion4");
        salon4.mostrarInfo();
        salon4.ambienteEducativo();
        salon4.lugarDeAprendizaje();

        Salon salon5 = new Salon("nombre5", 5, "ubicacion5");
        salon5.mostrarInfo();
        salon5.ambienteEducativo();
        salon5.lugarDeAprendizaje();

        Mouse mouse1 = new Mouse("marca1", "color1", "tipo1");
        mouse1.mostrarInfo();
        mouse1.mover();
        mouse1.conectar();

        Mouse mouse2 = new Mouse("marca2", "color2", "tipo2");
        mouse2.mostrarInfo();
        mouse2.mover();
        mouse2.conectar();

        Mouse mouse3 = new Mouse("marca3", "color3", "tipo3");
        mouse3.mostrarInfo();
        mouse3.mover();
        mouse3.conectar();

        Mouse mouse4 = new Mouse("marca4", "color4", "tipo4");
        mouse4.mostrarInfo();
        mouse4.mover();
        mouse4.conectar();

        Mouse mouse5 = new Mouse("marca5", "color5", "tipo5");
        mouse5.mostrarInfo();
        mouse5.mover();
        mouse5.conectar();

        Teclado teclado1 = new Teclado("marca1", "tamanio1", 1);
        teclado1.mostrarInfo();
        teclado1.escribir();
        teclado1.conectar();

        Teclado teclado2 = new Teclado("marca2", "tamanio2", 2);
        teclado2.mostrarInfo();
        teclado2.escribir();
        teclado2.conectar();

        Teclado teclado3 = new Teclado("marca3", "tamanio3", 3);
        teclado3.mostrarInfo();
        teclado3.escribir();
        teclado3.conectar();

        Teclado teclado4 = new Teclado("marca4", "tamanio4", 4);
        teclado4.mostrarInfo();
        teclado4.escribir();
        teclado4.conectar();

        Teclado teclado5 = new Teclado("marca5", "tamanio5", 5);
        teclado5.mostrarInfo();
        teclado5.escribir();
        teclado5.conectar();

        CPU cpu1 = new CPU("marca1", 190, 1);
        cpu1.mostrarInfo();
        cpu1.encender();
        cpu1.procesar();

        CPU cpu2 = new CPU("marca2", 290, 2);
        cpu2.mostrarInfo();
        cpu2.encender();
        cpu2.procesar();

        CPU cpu3 = new CPU("marca3", 390, 3);
        cpu3.mostrarInfo();
        cpu3.encender();
        cpu3.procesar();

        CPU cpu4 = new CPU("marca4", 490, 4);
        cpu4.mostrarInfo();
        cpu4.encender();
        cpu4.procesar();

        CPU cpu5 = new CPU("marca5", 590, 5);
        cpu5.mostrarInfo();
        cpu5.encender();
        cpu5.procesar();

        Impresora impresora1 = new Impresora("marca1", "tipo1", "colorTinta1");
        impresora1.mostrarInfo();
        impresora1.imprimir();
        impresora1.escanear();

        Impresora impresora2 = new Impresora("marca2", "tipo2", "colorTinta2");
        impresora2.mostrarInfo();
        impresora2.imprimir();
        impresora2.escanear();

        Impresora impresora3 = new Impresora("marca3", "tipo3", "colorTinta3");
        impresora3.mostrarInfo();
        impresora3.imprimir();
        impresora3.escanear();

        Impresora impresora4 = new Impresora("marca4", "tipo4", "colorTinta4");
        impresora4.mostrarInfo();
        impresora4.imprimir();
        impresora4.escanear();

        Impresora impresora5 = new Impresora("marca5", "tipo5", "colorTinta5");
        impresora5.mostrarInfo();
        impresora5.imprimir();
        impresora5.escanear();

        Parlante parlante1 = new Parlante("marca1", 1, "color1");
        parlante1.mostrarInfo();
        parlante1.reproducir();
        parlante1.silenciar();

        Parlante parlante2 = new Parlante("marca2", 2, "color2");
        parlante2.mostrarInfo();
        parlante2.reproducir();
        parlante2.silenciar();

        Parlante parlante3 = new Parlante("marca3", 3, "color3");
        parlante3.mostrarInfo();
        parlante3.reproducir();
        parlante3.silenciar();

        Parlante parlante4 = new Parlante("marca4", 4, "color4");
        parlante4.mostrarInfo();
        parlante4.reproducir();
        parlante4.silenciar();

        Parlante parlante5 = new Parlante("marca5", 5, "color5");
        parlante5.mostrarInfo();
        parlante5.reproducir();
        parlante5.silenciar();

        Microfono microfono1 = new Microfono("tipo1", "marca1");
        microfono1.mostrarInfo();
        microfono1.grabar();
        microfono1.silenciar();

        Microfono microfono2 = new Microfono("tipo2", "marca2");
        microfono2.mostrarInfo();
        microfono2.grabar();
        microfono2.silenciar();

        Microfono microfono3 = new Microfono("tipo3", "marca3");
        microfono3.mostrarInfo();
        microfono3.grabar();
        microfono3.silenciar();

        Microfono microfono4 = new Microfono("tipo4", "marca4");
        microfono4.mostrarInfo();
        microfono4.grabar();
        microfono4.silenciar();

        Microfono microfono5 = new Microfono("tipo5", "marca5");
        microfono5.mostrarInfo();
        microfono5.grabar();
        microfono5.silenciar();

        Camara camara1 = new Camara("marca1", "resolucion1", "tipo1");
        camara1.mostrarInfo();
        camara1.encender();
        camara1.capturar();

        Camara camara2 = new Camara("marca2", "resolucion2", "tipo2");
        camara2.mostrarInfo();
        camara2.encender();
        camara2.capturar();

        Camara camara3 = new Camara("marca3", "resolucion3", "tipo3");
        camara3.mostrarInfo();
        camara3.encender();
        camara3.capturar();

        Camara camara4 = new Camara("marca4", "resolucion4", "tipo4");
        camara4.mostrarInfo();
        camara4.encender();
        camara4.capturar();

        Camara camara5 = new Camara("marca5", "resolucion5", "tipo5");
        camara5.mostrarInfo();
        camara5.encender();
        camara5.capturar();

        Cable cable1 = new Cable("tipo1", 180, "color1");
        cable1.mostrarInfo();
        cable1.conectar();
        cable1.desconectar();

        Cable cable2 = new Cable("tipo2", 280, "color2");
        cable2.mostrarInfo();
        cable2.conectar();
        cable2.desconectar();

        Cable cable3 = new Cable("tipo3", 380, "color3");
        cable3.mostrarInfo();
        cable3.conectar();
        cable3.desconectar();

        Cable cable4 = new Cable("tipo4", 480, "color4");
        cable4.mostrarInfo();
        cable4.conectar();
        cable4.desconectar();

        Cable cable5 = new Cable("tipo5", 580, "color5");
        cable5.mostrarInfo();
        cable5.conectar();
        cable5.desconectar();

        Audifono audifono1 = new Audifono("marca1", "tipo1", 1);
        audifono1.mostrarInfo();
        audifono1.escuchar();
        audifono1.silenciar();

        Audifono audifono2 = new Audifono("marca2", "tipo2", 2);
        audifono2.mostrarInfo();
        audifono2.escuchar();
        audifono2.silenciar();

        Audifono audifono3 = new Audifono("marca3", "tipo3", 3);
        audifono3.mostrarInfo();
        audifono3.escuchar();
        audifono3.silenciar();

        Audifono audifono4 = new Audifono("marca4", "tipo4", 4);
        audifono4.mostrarInfo();
        audifono4.escuchar();
        audifono4.silenciar();

        Audifono audifono5 = new Audifono("marca5", "tipo5", 5);
        audifono5.mostrarInfo();
        audifono5.escuchar();
        audifono5.silenciar();

        MemoriaUSB memoriausb1 = new MemoriaUSB(1, "marca1", "color1");
        memoriausb1.mostrarInfo();
        memoriausb1.conectar();
        memoriausb1.guardar();

        MemoriaUSB memoriausb2 = new MemoriaUSB(2, "marca2", "color2");
        memoriausb2.mostrarInfo();
        memoriausb2.conectar();
        memoriausb2.guardar();

        MemoriaUSB memoriausb3 = new MemoriaUSB(3, "marca3", "color3");
        memoriausb3.mostrarInfo();
        memoriausb3.conectar();
        memoriausb3.guardar();

        MemoriaUSB memoriausb4 = new MemoriaUSB(4, "marca4", "color4");
        memoriausb4.mostrarInfo();
        memoriausb4.conectar();
        memoriausb4.guardar();

        MemoriaUSB memoriausb5 = new MemoriaUSB(5, "marca5", "color5");
        memoriausb5.mostrarInfo();
        memoriausb5.conectar();
        memoriausb5.guardar();

        Router router1 = new Router("marca1", 1, "tipoConexion1");
        router1.mostrarInfo();
        router1.conectar();
        router1.reiniciar();

        Router router2 = new Router("marca2", 2, "tipoConexion2");
        router2.mostrarInfo();
        router2.conectar();
        router2.reiniciar();

        Router router3 = new Router("marca3", 3, "tipoConexion3");
        router3.mostrarInfo();
        router3.conectar();
        router3.reiniciar();

        Router router4 = new Router("marca4", 4, "tipoConexion4");
        router4.mostrarInfo();
        router4.conectar();
        router4.reiniciar();

        Router router5 = new Router("marca5", 5, "tipoConexion5");
        router5.mostrarInfo();
        router5.conectar();
        router5.reiniciar();

    }
}
