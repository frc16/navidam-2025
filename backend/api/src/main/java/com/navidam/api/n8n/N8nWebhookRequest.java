package com.navidam.api.n8n;

import java.util.List;
import java.util.Map;

public class N8nWebhookRequest {
        private Recipient to;
        private String subject;
        private String html;
        private List<Attachment> attachments;
        private Map<String, String> meta;

        public N8nWebhookRequest(Recipient to, String subject, String html, List<Attachment> attachments,
                        Map<String, String> meta) {
                this.to = to;
                this.subject = subject;
                this.html = html;
                this.attachments = attachments;
                this.meta = meta;
        }

        public Recipient getTo() {
                return to;
        }

        public String getSubject() {
                return subject;
        }

        public String getHtml() {
                return html;
        }

        public List<Attachment> getAttachments() {
                return attachments;
        }

        public Map<String, String> getMeta() {
                return meta;
        }

        // Clases estáticas internas
        public static class Recipient {
                public String nombre;
                public String email;

                public Recipient(String nombre, String email) {
                        this.nombre = nombre;
                        this.email = email;
                }
        }

        public static class Attachment {
                public String filename;
                public String contentType;
                public String base64;

                public Attachment(String filename, String contentType, String base64) {
                        this.filename = filename;
                        this.contentType = contentType;
                        this.base64 = base64;
                }
        }
}