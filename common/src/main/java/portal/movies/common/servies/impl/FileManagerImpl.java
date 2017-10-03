package portal.movies.common.servies.impl;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import portal.movies.common.servies.FileManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileManagerImpl implements FileManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileManagerImpl.class);

    FTPClient ftpClient;

    String videoHost, photoHost, subHost, attachHost;

    String videoDir, photoDir, subDir, attachDir;

    String videoUser, videoPasswd, photoUser, photoPasswd, subUser, subPasswd, attachUser, attachPasswd;

    @Override
    public String upload2VideoRepo(File file) {
        boolean success = upload(videoHost, videoUser, videoPasswd, videoDir, file);
        String result = success ? videoHost : null;
        return result;
    }

    @Override
    public String upload2PhotoRepo(File file) {
        boolean success = upload(photoHost, photoUser, photoPasswd, photoDir, file);
        String result = success ? photoHost : null;
        return result;
    }

    @Override
    public String upload2SubtitleRepo(File file) {
        boolean success = upload(subHost, subUser, subPasswd, subDir, file);
        String result = success ? subHost : null;
        return result;
    }

    @Override
    public String upload2AttatchRepo(File file) {
        boolean success = upload(attachHost, attachUser, attachPasswd, attachDir, file);
        String result = success ? attachHost : null;
        return result;
    }

    private boolean upload(String host, String username, String password, String uploadDir, File file) {
        boolean status = false;
        int reply;
        try {
            ftpClient.connect(host);
            reply = ftpClient.getReplyCode();
            status = true;

            // check if host available
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                LOGGER.error("FTP not available");
                throw new Exception("FTP not available");
            }
            // login to remote ftp server
            ftpClient.login(username, password);
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();

            FileInputStream inputStream = new FileInputStream(file);

            ftpClient.storeFile(uploadDir + file.getName(), inputStream);

            inputStream.close();

            boolean deleted = file.delete();

        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                // logout and close connection
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            return status;
        }
    }

    public void setVideoHost(String videoHost) {
        this.videoHost = videoHost;
    }

    public void setPhotoHost(String photoHost) {
        this.photoHost = photoHost;
    }

    public void setSubHost(String subHost) {
        this.subHost = subHost;
    }

    public void setAttachHost(String attachHost) {
        this.attachHost = attachHost;
    }

    public void setFtpClient(FTPClient ftpClient) {
        this.ftpClient = ftpClient;
    }

    public void setVideoDir(String videoDir) {
        this.videoDir = videoDir;
    }

    public void setPhotoDir(String photoDir) {
        this.photoDir = photoDir;
    }

    public void setSubDir(String subDir) {
        this.subDir = subDir;
    }

    public void setAttachDir(String attachDir) {
        this.attachDir = attachDir;
    }

    public void setVideoUser(String videoUser) {
        this.videoUser = videoUser;
    }

    public void setVideoPasswd(String videoPasswd) {
        this.videoPasswd = videoPasswd;
    }

    public void setPhotoUser(String photoUser) {
        this.photoUser = photoUser;
    }

    public void setPhotoPasswd(String photoPasswd) {
        this.photoPasswd = photoPasswd;
    }

    public void setSubUser(String subUser) {
        this.subUser = subUser;
    }

    public void setSubPasswd(String subPasswd) {
        this.subPasswd = subPasswd;
    }

    public void setAttachUser(String attachUser) {
        this.attachUser = attachUser;
    }

    public void setAttachPasswd(String attachPasswd) {
        this.attachPasswd = attachPasswd;
    }
}
