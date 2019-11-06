package fr.houseofcode.dap.dap.cmd;

import fr.housseofcode.dap.dap.cmd.DapClient;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author ragga
 *
 */
public class DapClientTest {

    /**
     * vérifie que les url dap fonctionne.
     */
    @Test
    public void testBuildUrl() {
        @SuppressWarnings("PMD.LocalVariableCouldBeFinal")
        String path = "/a";
        @SuppressWarnings("PMD.LocalVariableCouldBeFinal")
        String userId = "test";

        final String result = DapClient.buildUrl(path, userId);

        Assert.assertEquals("url mal construite", "http://localhost:8080/a?userId=test", result);
        //http://localhost:8080/a?userId=test
    }

    @Test
    public void testBuildUrlInvalidPath() {
        @SuppressWarnings("PMD.LocalVariableCouldBeFinal")
        String path = "a";
        @SuppressWarnings("PMD.LocalVariableCouldBeFinal")
        String userId = "test";

        final String result = DapClient.buildUrl(path, userId);

        Assert.assertEquals("url mal construite", "http://localhost:8080/a?userId=test", result);
        //http://localhost:8080/a?userId=test
    }

    @Test
    public void testGetDapData() {
        @SuppressWarnings("PMD.LocalVariableCouldBeFinal")
        String path = "/emails/unread/count";
        @SuppressWarnings("PMD.LocalVariableCouldBeFinal")
        String userId = "guillaume";

        final String result = DapClient.getDapData(path, userId);

        Assert.assertEquals("valeure invalide", "1", result);
        //http://localhost:8080/a?userId=guillaume
    }
}