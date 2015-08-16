package com.zhi.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/**
 * Created by root on 2015-8-16.
 */
public class FileUploadAction extends ActionSupport {
    private File image;
    private String imageContentType;
    private String imageFileName;
    private String savePath;

    @Override
    public String execute() {
        FileOutputStream fos = null;
        FileInputStream fis = null;
//        System.out.println(getSavePath());
//        System.out.println(image.length());
//        System.out.println(imageFileName);
//        System.out.println(imageContentType);
        try {
            fos = new FileOutputStream(getSavePath() + "/" + getImageFileName());
            fis = new FileInputStream(getImage());
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len=fis.read(buffer))!=-1)
                fos.write(buffer,0,len);
        } catch (Exception e) {
            System.out.println("文件上传失败");
            e.printStackTrace();
            return INPUT;
        }finally {
            close(fos,fis);
        }

        return SUCCESS;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getSavePath() {
//        System.out.println(ServletActionContext.getServletContext().getRealPath(savePath));
        return ServletActionContext.getServletContext().getRealPath(savePath);
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    private void close(FileOutputStream fos, FileInputStream fis){
        if (fis != null){
            try {
                fis.close();
            } catch (IOException e) {
                System.out.printf("FileInputStream关闭失败");
                e.printStackTrace();
            }
        }

        if (fos != null){
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("FileOutputStream关闭失败");
                e.printStackTrace();
            }
        }
    }
}
