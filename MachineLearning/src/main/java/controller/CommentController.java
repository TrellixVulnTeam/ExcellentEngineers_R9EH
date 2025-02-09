package controller;

import bl.CommentBL.CommentBLServiceImpl;
import blservice.CommentBLService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/27.
 */
@Controller
@RequestMapping(value = "/comment")
public class CommentController {
    @RequestMapping(value = "/score", method = RequestMethod.POST)
    @ResponseBody
    public int Score(@RequestParam("evalinput") String evalinput){
        int result = 0;
        CommentBLService commentBLService = new CommentBLServiceImpl();
        String comment = commentBLService.comment(evalinput);

        result = Integer.parseInt(comment);
        return result;
    }
}
