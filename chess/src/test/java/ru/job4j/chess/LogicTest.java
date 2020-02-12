package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LogicTest {
    @Test
    public void whenFigureCanMove() {
        Logic logic = new Logic();
        Figure bishopBlack = new BishopBlack(Cell.C1);
        logic.add(bishopBlack);
        assertThat(logic.move(Cell.C1, Cell.G5), is(true));
    }

    @Test
    public void whenFigureCanNotMove() {
        Logic logic = new Logic();
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Figure pawn = new PawnBlack(Cell.D2);
        logic.add(bishopBlack);
        logic.add(pawn);
        assertThat(logic.move(Cell.C1, Cell.G5), is(false));
    }
}
