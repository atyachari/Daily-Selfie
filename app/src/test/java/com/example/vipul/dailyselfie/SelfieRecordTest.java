package com.example.vipul.dailyselfie;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SelfieRecordTest {
    @Test
    public void selfieRecord_DisplayName() {
        SelfieRecord selfieRecord = new SelfieRecord("", "20220101_000000");
        assertEquals(selfieRecord.getDisplayName(), "01 Jan, 2022 00:00:00");
    }

    @Test
    public void selfieRecord_DisplayData() {
        SelfieRecord selfieRecord = new SelfieRecord("Test", "20220101_000000");
        assertEquals(selfieRecord.getDisplayData(), "Test01 Jan, 2022 00:00:00");
        assertEquals(selfieRecord.getDisplayName(), "01 Jan, 2022 00:00:00");
    }

}