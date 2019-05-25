/*    */ package com.github.schartz.bebics.certificate;
/*    */ 
/*    */ import java.security.cert.X509Certificate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KeyStoreCache
/*    */   extends Object
/*    */   implements Comparable<KeyStoreCache>
/*    */ {
/*    */   private String alias;
/*    */   private X509Certificate certificate;
/*    */   private boolean isKeyEntry;
/*    */   
/* 38 */   public String getAlias() { return this.alias; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setAlias(String paramString) {
/* 46 */     if (paramString != null) {
/* 47 */       this.alias = paramString;
/*    */     } else {
/* 49 */       this.alias = "";
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 58 */   public X509Certificate getCertificate() { return this.certificate; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 66 */   public void setCertificate(X509Certificate paramX509Certificate) { this.certificate = paramX509Certificate; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 74 */   public boolean isKeyEntry() { return this.isKeyEntry; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 82 */   public void setKeyEntry(boolean paramBoolean) { this.isKeyEntry = paramBoolean; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 87 */   public int compareTo(KeyStoreCache paramKeyStoreCache) { return this.alias.toUpperCase().compareTo(paramKeyStoreCache.getAlias().toUpperCase()); }
/*    */ }


/* Location:              /home/schartz/ebics-1.0.2-sources-old.jar!/org/schartz/ebicjava/certificate/KeyStoreCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.0
 */