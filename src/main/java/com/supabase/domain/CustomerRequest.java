package com.supabase.domain;

public record CustomerRequest(
        String firstName,
        String lastName,
        String city
) {
}
