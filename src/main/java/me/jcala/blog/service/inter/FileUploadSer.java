package me.jcala.blog.service.inter;

import me.jcala.blog.domain.Info;
import me.jcala.blog.domain.UploadPic;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/9/25.
 */
public interface FileUploadSer {
    UploadPic uploadPic(HttpServletRequest request);
    Info updateAvatar(HttpServletRequest request);
}
