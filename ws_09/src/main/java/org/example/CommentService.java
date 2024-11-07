package org.example;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private static final Logger logger = Logger.getLogger(CommentService.class.getName());

    // 댓글 정보를 출력하는 메서드
    @ToLog
    public String printComment(CommentInfo commentInfo) {
        System.out.println("PRINT COMMENT > Author: " + commentInfo.getAuthor() + ", Text: " + commentInfo.getText());
        logger.info("PRINT COMMENT > Author: " + commentInfo.getAuthor() + ", Text: " + commentInfo.getText());

        return "FAIL";
    }
}
