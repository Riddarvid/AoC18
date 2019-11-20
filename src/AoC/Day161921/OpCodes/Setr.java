package AoC.Day161921.OpCodes;

import AoC.Day161921.Memory;

public class Setr extends OpcodeFunction {

    public Memory applySpecific() {
        registers[instruction.getOutput()] = registers[instruction.getA()];
        return new Memory(registers);
    }

    @Override
    public String toString() {
        return "Setr";
    }
}
