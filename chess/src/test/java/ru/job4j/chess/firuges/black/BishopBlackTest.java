package ru.job4j.chess.firuges.black;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {
    @Test
    public void whenFigureHasCorrectPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(C1));
    }

    @Test
    public void whenCopyFigureHasCorrectPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure expected = bishopBlack.copy(E3);
        assertThat(expected.position(), is(E3));
    }

    @Test
    public void whenWayReturnCorrectSteps() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = new Cell[] {D2, E3, F4, G5};
        assertThat(bishopBlack.way(C1, G5), is(expected));
    }
}
