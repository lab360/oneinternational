package br.com.lab360.oneinternacional.logic.listeners.Chat;

import br.com.lab360.oneinternacional.logic.model.pojo.chat.EventMessage;

/**
 * Created by Alessandro Valenza on 05/12/2016.
 */
public interface OnChatMessageSentListener {
    void onSendMessageSuccess(EventMessage messageSent, int position);
    void onSendMessageError(String message, int position);
}

