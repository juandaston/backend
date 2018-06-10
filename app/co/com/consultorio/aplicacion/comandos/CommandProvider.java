package co.com.consultorio.aplicacion.comandos;

import co.com.consultorio.aplicacion.comandos.actualizarPaciente.ActualizarPacienteCommand;
import co.com.consultorio.aplicacion.comandos.actualizarPaciente.ActualizarPacienteSerializer;
import co.com.consultorio.aplicacion.comandos.editarAntecedente.EditarAntecedenteCommand;
import co.com.consultorio.aplicacion.comandos.editarAntecedente.EditarAntecedenteSerializer;
import co.com.consultorio.aplicacion.comandos.finalizarConsulta.FinalizarConsultaCommand;
import co.com.consultorio.aplicacion.comandos.finalizarConsulta.FinalizarConsultaSerializer;
import co.com.consultorio.aplicacion.comandos.ingresarAntecedente.IngresarAntecedenteCommand;
import co.com.consultorio.aplicacion.comandos.ingresarAntecedente.IngresarAntecedenteSerializer;
import co.com.consultorio.aplicacion.comandos.ingresarpaciente.IngresarPacienteCommand;
import co.com.consultorio.aplicacion.comandos.ingresarpaciente.IngresarPacienteSerializer;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import javaslang.Tuple;
import javaslang.Tuple2;
import play.Logger;

import java.util.HashMap;
import java.util.Map;

@Singleton
public class CommandProvider {

    private final Map<String, Tuple2<? extends CommandDeserializer, Command>> commands;


    @Inject
    public CommandProvider(IngresarPacienteCommand ingresarPacienteCommand,
                           ActualizarPacienteCommand actualizarPacienteCommand,
                           FinalizarConsultaCommand finalizarConsultaCommand,
                           IngresarAntecedenteCommand ingresarAntecedenteCommand,
                           EditarAntecedenteCommand editarAntecedenteCommand

    ) {

        this.commands = new HashMap<>();
        commands.put("IngresarPaciente", Tuple.of(new IngresarPacienteSerializer(), ingresarPacienteCommand));
        commands.put("ActualizarPaciente", Tuple.of(new ActualizarPacienteSerializer(), actualizarPacienteCommand));
        commands.put("FinalizarConsulta", Tuple.of(new FinalizarConsultaSerializer(), finalizarConsultaCommand));
        commands.put("IngresarAntecedente", Tuple.of(new IngresarAntecedenteSerializer(), ingresarAntecedenteCommand));
        commands.put("EditarAntecedente", Tuple.of(new EditarAntecedenteSerializer(), editarAntecedenteCommand));
    }

    public Tuple2<? extends CommandDeserializer, Command> provide(String nombreComando) {
        Logger.debug(nombreComando);
        return commands.get(nombreComando);
    }
}
