/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Rssystem;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminManage;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class SystemAdminRole extends Role{
    
    
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, Rssystem b) {
        return new SystemAdminManage(p,b);
    }
}
